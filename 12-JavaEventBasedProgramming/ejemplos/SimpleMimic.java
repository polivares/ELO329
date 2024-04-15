import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
// Clases javafx están documentadas en:
//https://docs.oracle.com/javase/8/javafx/api/toc.htm

public class SimpleMimic extends Application {
	private Label label; // Label
	private TextField textfield; // Campo de texto
   
	public void start(Stage primaryStage) {
   //Clase FlowPane sirve para organizar posición de objetos gráficos.
		FlowPane layout = new FlowPane();  
		Scene scene = new Scene(layout,200,50); // parte interna de una stage
		label = new Label("Echo appears here");
		textfield = new TextField();
		textfield.setPrefWidth(200);
		layout.getChildren().addAll(textfield,label);
		primaryStage.setScene(scene);

		// Registro de un evento con un manejador de eventos
		textfield.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.ENTER){
					label.setText(textfield.getText());
				}
			}
		});
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
