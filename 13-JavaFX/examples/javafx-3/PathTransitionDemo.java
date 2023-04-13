
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.Interpolator;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {

    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);
        Circle circle = new Circle(125, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().addAll(circle, rectangle);
// Create a path transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(500));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(false);
	pt.setInterpolator(Interpolator.LINEAR);
        pt.play(); // Start animation
        circle.setOnMousePressed(e -> pt.pause());
        circle.setOnMouseReleased(e -> pt.play());
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("PathTransitionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
/* main has been omitted */
}
