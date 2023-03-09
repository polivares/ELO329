import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class SkyController {
   public SkyController (Drone drone) {
       this.drone = drone;
       cView = new ControllerView();
       Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), e->updateTelemetry()));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
   }
   public void setInputDeviceView(Node view){
      inputDeviceView = view;
   }
   public Node getInputDeviceView() {
      return inputDeviceView;
   }
   // the next four methods implement the controller (radio)
   // in charge of sending commands to the drone. 
   protected void sendTakeOffCommand(){  // make drone take-off
      drone.takeOff();
   }
   protected void sendLandCommand(){   // make drone land
      drone.setRotationSpeed(0);
      drone.setFlightSpeed(0,0,0); // verical, forward and sideways speeds      
      drone.land();
   }
   public void sendRotationSpeed(double rs) {  // set drone's rotation speed
      drone.setRotationSpeed(rs);
   }
   public void sendFlightSpeed(double vs, double fs, double ss ) {  // set drone's flight speed
      drone.setFlightSpeed(vs, fs, ss); // verical, forward and sideways speeds
   }
   public VBox getView(){
      VBox vbox = new VBox(5);
      vbox.getChildren().addAll(cView, inputDeviceView);
      vbox.setAlignment(Pos.CENTER);
      vbox.setStyle("-fx-background-color: lightblue;");
      return vbox;
   }
   public void updateTelemetry(){
      cView.setPosition(drone.getPosX(), drone.getPosY(), drone.getHeight());
   }
   private ControllerView cView;
   private Node inputDeviceView;
   private Drone drone;
}