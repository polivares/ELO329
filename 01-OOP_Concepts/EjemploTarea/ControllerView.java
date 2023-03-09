import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.geometry.Pos;

public class ControllerView extends GridPane {
   public ControllerView (){
      xPos = new Label(); yPos= new Label(); hPos = new Label();
      xPos.setFont(Font.font(22));
      yPos.setFont(Font.font(22));
      hPos.setFont(Font.font(22));
      add(xPos,0,0);
      add(yPos,1,0);
      add(hPos,2,0);
      Label cap = new Label("x [cm]      ");
      cap.setFont(Font.font(22));
      add(cap,0,1);
      cap = new Label("y [cm]      "); cap.setFont(Font.font(22));
      add(cap,1,1);
      cap = new Label("h [cm]"); cap.setFont(Font.font(22));
      add(cap,2,1);
      setAlignment(Pos.CENTER);
   }
   public void setPosition (double x, double y, double h) {
      xPos.setText(" "+(int)x);
      yPos.setText(" "+(int)y);
      hPos.setText(" "+(int)h);
   }
   private Label xPos, yPos, hPos;
}