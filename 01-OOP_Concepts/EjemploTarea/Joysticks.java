import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class Joysticks extends InputDevice {
   public Joysticks (SkyController controller) {
      super(controller);
      rStick = new Joystick(this);
      lStick = new Joystick(this);
      HBox hbox = new HBox(20);
      hbox.getChildren().addAll(lStick.getView(),rStick.getView());
      hbox.setAlignment(Pos.CENTER);
      Button takeOffLand = new Button("Take-Off");
      view = new VBox(10);
      view.getChildren().addAll(hbox,takeOffLand);
      view.setAlignment(Pos.CENTER);
      takeOffLand.setOnAction (e->{
                        if (button==State.TAKE_OFF)
                           takeOffLand.setText("Landing");
                        else
                           takeOffLand.setText("Take-Off");
                        pushTakeOff_Land();
                        });
   }
   public void updateInputCommnad() {
      updateRotationSpeed(lStick.getHorPos());
      updateFlightSpeed(lStick.getVerPos(), rStick.getVerPos(), rStick.getHorPos());
   }
   public VBox getView() {
      return view;
   }
   private VBox view;
   private Joystick lStick, rStick;
}