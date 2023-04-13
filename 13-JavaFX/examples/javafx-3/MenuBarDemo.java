import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class MenuBarDemo extends Application {
   private TextField tfNumber1 = new TextField();
   private TextField tfNumber2 = new TextField();
   private TextField tfResult = new TextField();
   public void start(Stage primaryStage) {
      MenuBar menuBar = new MenuBar();
      Menu menuOperation = new Menu("Operation");
      Menu menuExit = new Menu("Exit");
      menuBar.getMenus().addAll(menuOperation, menuExit);
      MenuItem menuItemAdd = new MenuItem("Add");
      MenuItem menuItemSubtract = new MenuItem("Subtract");
      menuOperation.getItems().addAll(menuItemAdd, menuItemSubtract);
      MenuItem menuItemClose = new MenuItem("Close");
      menuExit.getItems().add(menuItemClose);
      menuItemAdd.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
      menuItemSubtract.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
      HBox hBox1 = new HBox(5);
      hBox1.getChildren().addAll(new Label("Number 1:"), tfNumber1,
              new Label("Number 2:"), tfNumber2, new Label("Result:"),
              tfResult);
      hBox1.setAlignment(Pos.CENTER);
      tfNumber1.setPrefColumnCount(2);
      tfNumber2.setPrefColumnCount(2);
      tfResult.setPrefColumnCount(2);
      VBox vBox = new VBox(10);
      vBox.getChildren().addAll(menuBar, hBox1);
      Scene scene = new Scene(vBox, 450, 100);
      primaryStage.setTitle("MenuBarDemo"); // Set the window title
      primaryStage.setScene(scene); // Place the scene in the window
      primaryStage.show(); // Display the window
// Handle menu actions
      menuItemAdd.setOnAction(e -> perform('+'));
      menuItemSubtract.setOnAction(e -> perform('-'));
      menuItemClose.setOnAction(e -> System.exit(0));
   }

   private void perform(char operator) {
      double number1 = Double.parseDouble(tfNumber1.getText());
      double number2 = Double.parseDouble(tfNumber2.getText());
      double result = 0;
      switch (operator) {
         case '+': result = number1 + number2;  break;
         case '-': result = number1 - number2;  break;
      }
      tfResult.setText(result + "");
   }

   public static void main(String[] args) {
      launch(args);
   }
}