import java.io.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.lang.Math;

public class Drone  {
   public Drone () throws IOException {
      state = State.LANDED;
      time=AppTime.getCurrentTime();
      fSpeed=vSpeed=sSpeed=rSpeed=0f;
      direction= -Math.PI/2;
      x=y=300;      h=0f;
      out = new PrintWriter(new FileWriter("drone.csv")); // the JVM calls close when exiting.
      view = new DroneView();
      updateView();
      animation = new Timeline(new KeyFrame(Duration.millis(100), e->takeAction()));
      animation.setCycleCount(Timeline.INDEFINITE);
   }
   static {
      MAX_F_SPEED = MAX_S_SPEED = 50; // [cm/s]
      MAX_V_SPEED = 20;    // [cm/s]
      MAX_R_SPEED = (double)(0.25*Math.PI/2); // [rad/s]
      TAKEOFF_LANDING_SPEED = 20; // [cm/s]
   }
   public void takeAction(){
      double current_t = AppTime.getCurrentTime();
      double delta_t=current_t-time;
      switch (state) {
      case TAKING_OFF://drone moves only upwards in this state
         h+=TAKEOFF_LANDING_SPEED*delta_t;
         if(h >= 100.0f) state = State.FLYING; 
         break;
      case FLYING:
         direction += rSpeed*delta_t;
         x+=(fSpeed*Math.cos(direction)-sSpeed*Math.sin(direction))*delta_t;
         y+=(+fSpeed*Math.sin(direction)+sSpeed*Math.cos(direction))*delta_t;
         h+=vSpeed*delta_t;
         break;
      case LANDING://drone moves only downwards in this state
         h+=-TAKEOFF_LANDING_SPEED*delta_t;
         if(h <=0f) {
           state = State.LANDED; 
           view.pause();
           animation.pause();
         }
         break;         
      }
      updateView();
      time = current_t;
      out.println(time+", "+this); out.flush();
   }
   private void updateView() {
      view.setLayoutX(x);
      view.setLayoutY(y);
      view.setRotate(direction*180/Math.PI+90);  // this is in degree!!
      view.setScaleX(1-h/1000);
      view.setScaleY(1-h/1000);
   }
   public void setRotationSpeed(double percentage) {
      rSpeed = percentage*MAX_R_SPEED;
   }
   public void setFlightSpeed(double verPer, double forwPer, double sidePer) {
      vSpeed = verPer*MAX_V_SPEED;
      fSpeed = forwPer*MAX_F_SPEED;
      sSpeed = sidePer*MAX_S_SPEED;
   }
   public State getState() {
      return state;
   }
   public String toString() {
      return x + ", " + y + ", " + h +"," +state;
   }
   public void takeOff() {
      if (state==State.LANDED){
         state = State.TAKING_OFF;
         view.play();
         animation.play();
         time=AppTime.getCurrentTime();
      }
   }
   public void land() {
      if (state!=State.LANDED)
         state = State.LANDING;
   }
   public void closeFile(){
      out.close();
   }
   public DroneView getView() {
      return view;
   }
   public double getPosX() {
      return x;
   }
   public double getPosY() {
      return y;
   }
   public double getHeight() {
      return h;
   }
   Timeline animation;
   private DroneView view;
   private State state;
   private double time;
   private double fSpeed, vSpeed, sSpeed, rSpeed;
   private double direction; // angle
   private double x,y,h;
   private PrintWriter out; 
   private static double MAX_F_SPEED;
   private static double MAX_V_SPEED;
   private static double MAX_S_SPEED;
   private static double MAX_R_SPEED;
   private static double TAKEOFF_LANDING_SPEED;
}