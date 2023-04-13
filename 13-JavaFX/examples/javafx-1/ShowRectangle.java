import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import java.util.Collections;

public class ShowRectangle extends Application {

    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10, 27, "r1"));
        pane.getChildren().add(r1);
        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        pane.getChildren().add(new Text(10, 67, "r2"));
        pane.getChildren().add(r2);
        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(),
                    Math.random()));
            r.setFill(Color.WHITE);
            pane.getChildren().add(r);
        }
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
