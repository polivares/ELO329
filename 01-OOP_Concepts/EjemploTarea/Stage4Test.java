import java.io.*;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.transform.Affine;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.animation.PathTransition;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class Stage4Test extends Application {
   static {
      Locale.setDefault(Locale.US);
   }
   public void start(Stage primaryStage) throws IOException {
      Pane pane = new Pane();
      Drone drone = new Drone();
      pane.getChildren().add(drone.getView());
      skyController = new SkyController(drone);
      Keyboard keyboard = new Keyboard(skyController);
      Joysticks joysticks = new Joysticks(skyController);
      skyController.setInputDeviceView(joysticks.getView()); 
      MenuBar menuBar = new MenuBar();
      Menu menuInputDevice = new Menu("Input Device");
      menuBar.getMenus().add(menuInputDevice);
      MenuItem menuItemKeyboard = new MenuItem("Keyboard");
      MenuItem menuItemJoysticks = new MenuItem("Joysticks");
      menuInputDevice.getItems().addAll(menuItemKeyboard, menuItemJoysticks);
      BorderPane bp = new BorderPane(); 
      bp.setCenter(pane);
      bp.setTop(menuBar);
      bp.setBottom(skyController.getView());
      menuItemKeyboard.setOnAction(e->setNewInputDevice(keyboard, bp));
      menuItemJoysticks.setOnAction(e->setNewInputDevice(joysticks,bp));      
      Scene scene = new Scene(bp, 800,900);
      primaryStage.setTitle("T2 Stage 3");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   private void setNewInputDevice(InputDevice id, BorderPane bp){
      if(skyController.getInputDeviceView()!=id.getView()){
         skyController.setInputDeviceView(id.getView());
         bp.setBottom(skyController.getView());
      }
   }
   private SkyController skyController;
}
