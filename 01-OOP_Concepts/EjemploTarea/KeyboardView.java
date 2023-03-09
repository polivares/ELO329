import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

class KeyboardView extends StackPane {
   public KeyboardView (){
      Label label = new Label("Select this area for keyboard input device");
      label.setFont(Font.font(24));
      setPrefHeight(60);
      setFocusTraversable(true);  // needed to receive mouse and keyboard events.
      setStyle("-fx-background-color: lightblue;"); // to learn on other options, 
 // see: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html
      getChildren().add(label);
   }
}