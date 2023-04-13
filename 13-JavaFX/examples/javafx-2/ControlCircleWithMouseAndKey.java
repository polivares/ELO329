import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class ControlCircleWithMouseAndKey extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
// Create a scene and place it in the stage
        Scene scene = new Scene(circlePane, 200, 150);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            } else if (e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                circlePane.enlarge();
            } else if (e.getCode() == KeyCode.DOWN) {
                circlePane.shrink();
            }
        });
    }
}
class CirclePane extends StackPane {
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }
    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }
    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2
                    : circle.getRadius());
    }
}
