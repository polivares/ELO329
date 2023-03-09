import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class Keyboard extends InputDevice {
   public Keyboard(SkyController controller) {
      super(controller);
      rPos=vPos=fPos=sPos=0;
      view = new KeyboardView();
      view.setOnKeyPressed(e->handleKey(e));
      updateRotationSpeed(rPos);
      updateFlightSpeed(vPos, fPos, sPos);
   }
   public void handleKey(KeyEvent e) {
      switch (e.getCode()) {
         case W: vPos+=sensibility; 
                         if (vPos > 1) vPos=1;
                         break;
         case A: rPos-=sensibility;
                         if (rPos < -1) rPos=-1;
                         break;
         case S: rPos+=sensibility;
                         if (rPos > 1) rPos=1;
                         break;
         case Z: vPos-=sensibility;
                         if (vPos < -1) vPos=-1;
                         break;
         case I: fPos+=sensibility;
                         if (fPos > 1) fPos=1;
                         break;
         case J: sPos-=sensibility;
                         if (sPos < -1) sPos=-1;
                         break;
         case K: sPos+=sensibility;
                         if (sPos > 1) sPos=1;
                         break;
         case M: fPos-=sensibility; 
                         if (fPos < -1) fPos=-1;
                         break;
         case SPACE: pushTakeOff_Land();
      }
      updateRotationSpeed(rPos);
      updateFlightSpeed(vPos, fPos, sPos);
   }
   public KeyboardView getView() {
      return view;
   }
   private KeyboardView view;
   private float rPos, vPos, fPos, sPos;
   private static float sensibility=0.2f;
}