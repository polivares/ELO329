public class Joystick {
   public Joystick (Joysticks joys) {
      vf=0.0f;
      hf=0.0f;
      joysticks = joys;
      view = new JoystickView(this);
   }
   public void setPos(double h, double v){
      hf = h;
      vf = v;
      joysticks.updateInputCommnad();
   } 
   public double getVerPos() {
      return vf;
   }
   public double getHorPos() {
      return hf;
   }
   public String toString() {
      return hf+","+vf;
   }
   public JoystickView getView(){
      return view;
   }
   private Joysticks joysticks;
   private JoystickView view;
   private double vf, hf;
}