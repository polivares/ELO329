import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class ShowCircleCentered extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
// Create a pane to hold the circle
        Pane pane = new Pane();
// Create a circle and set its properties
        Circle circle = new Circle();
        // Esto es el cálculo para que el círculo esté siempre al centro de la ventana
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle); // Add circle to the pane
// Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

/**
* The main method is only needed for the IDE with limited
* JavaFX support. Not needed for running from the command line.
*/
public static void main(String[] args) {
        launch(args);
    }
}
