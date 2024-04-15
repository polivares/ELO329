import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class CloseableStage_Lambda extends Application {
   public void start(Stage primaryStage) {
      // Creamos elementos de la ventana
      BorderPane root = new BorderPane();
      Scene scene = new Scene(root,300,200);
      primaryStage.setScene(scene);

   // Creamos Listener asociado al cierre de ventana
      primaryStage.setOnCloseRequest(e->System.out.println("Stage is closing"));
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}
