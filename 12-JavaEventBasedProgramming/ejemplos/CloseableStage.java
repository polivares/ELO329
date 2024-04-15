import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class CloseableStage extends Application {
   public void start(Stage primaryStage) { //Redefinimos un método de Application
      // Creamos elementos de la ventana
      BorderPane root = new BorderPane();
      Scene scene = new Scene(root,300,200);
      primaryStage.setScene(scene);

   // Creamos Listener asociado al cierre de ventana
      primaryStage.setOnCloseRequest(new MyWindowHandler());// Registro de un evento con un manejador de eventos
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);   // de este método de Application se llama a start.
   }
}

/*
 * Clase que maneja el cierre de ventana. 
 * OJO: Esta clase podría haber sido definida 
 * como clase anónima o como expresión Lambda!
 */
// Creación de la clase manejadora de eventos
class MyWindowHandler implements EventHandler<WindowEvent>{
   public void handle(WindowEvent e) {
      System.out.println("Stage is closing");
   }
}