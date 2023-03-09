import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.input.MouseEvent;

public class JoystickView extends Pane  {
   private final int S=150;  //Size
   public JoystickView (Joystick stick) {
      this.stick = stick;
      Circle base = new Circle(S/2, S/2, S/2-5);
      base.setFill(Color.LIGHTBLUE);
      handle = new Circle(S/2,S/2, S/7);
      handle.setFill(Color.BLUE);
      handle.setOnMouseDragged(e->updatePosition(e));
      handle.setOnMouseReleased(e->setNeutralPosition());
      setPrefHeight(S);
      setPrefWidth(S);
      setStyle("-fx-background-color: black;"); // to learn on other options, 
 // see: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html
      getChildren().addAll(base, handle);
   }
   private void updatePosition(MouseEvent e) {
      double x=e.getX()-S/2;
      double y=e.getY()-S/2;
      if (Math.sqrt(x*x+y*y)>=S/2-5) return;
      stick.setPos(x/(S/2-5),-y/(S/2-5));
      handle.setCenterX(e.getX());
      handle.setCenterY(e.getY());
   }
   private void setNeutralPosition() {
      stick.setPos(0,0);
      handle.setCenterX(S/2);
      handle.setCenterY(S/2);
   }
   private Joystick stick;
   private Circle handle;
}