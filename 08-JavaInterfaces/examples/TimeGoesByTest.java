import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.awt.event.*; //ActionListener & ActionEvent

public class TimeGoesByTest {
   public static void main(String[] argv){
      int deltaTime = 100; // [ms]
      TimeGoesBy timeTick = new TimeGoesBy(deltaTime);
      Timer timer = new Timer(deltaTime, timeTick); // will call tick.actionPerformed() 
      timer.start();                      // every deltaTime [ms]  
      int option;
      do {
         System.out.println("Current time since program started: "+timeTick.getTime()+"[ms]");
         option = JOptionPane.showConfirmDialog(null, "Do you want to know the time so far?");     
      } while (option == JOptionPane.YES_OPTION);
      System.exit(0);
   }
}
class TimeGoesBy implements ActionListener {
   public TimeGoesBy(int deltaTime){
      time=0;
      this.deltaTime = deltaTime;
   }
   public void actionPerformed(ActionEvent e) {
      time+=deltaTime;
   }
   public int getTime() {
      return time;
   }
   private int time;
   public int deltaTime; 
}
