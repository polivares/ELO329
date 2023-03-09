import javafx.scene.Node;

public abstract class InputDevice {
   public InputDevice (SkyController controller) {
      button=State.TAKE_OFF;
      this.controller=controller;
   }
   public abstract Node getView();
   public void updateRotationSpeed(double rPos){
      controller.sendRotationSpeed(rPos);
   }
   public void updateFlightSpeed(double vPos, double fPos, double sPos){
      controller.sendFlightSpeed(vPos, fPos, sPos);
   }   
   public void pushTakeOff_Land () {
      switch (button) {
         case TAKE_OFF: controller.sendTakeOffCommand(); break;
         case LANDING: controller.sendLandCommand(); break;
      }
      button = button==State.TAKE_OFF?State.LANDING:State.TAKE_OFF;
   }
   public void setDroneState(State state){
      if (state==State.LANDED || state==State.LANDING)
         button=State.TAKE_OFF;
      else  button=State.LANDING;
   }
   protected State button;
   protected SkyController controller;
}