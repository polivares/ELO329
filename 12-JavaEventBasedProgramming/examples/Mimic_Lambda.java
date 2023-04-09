import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class Mimic_Lambda extends Application {
	private Label label;
	private TextField textfield;
   
	public void start(Stage primaryStage) {
		FlowPane layout = new FlowPane();
		Scene scene = new Scene(layout,200,50);
		label = new Label("Echo appears here");
		textfield = new TextField();
		textfield.setPrefWidth(200);
		layout.getChildren().addAll(textfield,label);
		primaryStage.setScene(scene);
		textfield.setOnKeyReleased(e->{if (e.getCode() == KeyCode.ENTER)
                                          label.setText(textfield.getText());
		                               });
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
