import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.animation.RotateTransition;
import javafx.animation.FadeTransition;
import javafx.scene.shape.Polygon;
import javafx.animation.ParallelTransition;
import javafx.util.Duration;
import javafx.animation.Interpolator;
import javafx.scene.paint.Color;
import javafx.animation.Timeline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.geometry.Point3D;
import java.lang.Math;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

class DroneView extends Group{
   private static final String MEDIA_URL = 
         "http://profesores.elo.utfsm.cl/~agv/elo329/JavaProg/JavaFX/AudioMediaDemo/droneSound.mp3";
   private ParallelTransition pt = new ParallelTransition();
   private MediaPlayer mediaPlayer;
   public DroneView (){
      int i;
      // add propellers
      Polygon[] propellers = new Polygon[4];
      RotateTransition rt[] = new RotateTransition[4];
      for(i=0; i<4; i++){
         propellers[i] = new Polygon(6,-6, 60,-6, 60,6 ,6,6, 6,60, -6,60,
                           -6,6, -60,6, -60,-6, -6,-6, -6,-60, 6, -60);
         rt[i] = new RotateTransition(Duration.millis(1000), propellers[i]);
         rt[i].setInterpolator(Interpolator.LINEAR);
         pt.getChildren().add(rt[i]);
         getChildren().add(propellers[i]);
      }
      propellers[0].setFill(Color.BLUE);
      propellers[1].setFill(Color.BLUE);
      propellers[1].setTranslateX(200);
      propellers[2].setTranslateY(200);
      propellers[2].setFill(Color.BLUE);
      propellers[3].setTranslateX(200);
      propellers[3].setTranslateY(200);
      propellers[3].setFill(Color.BLUE);
      rt[0].setByAngle(360f);   rt[1].setByAngle(-360f);
      rt[2].setByAngle(360f);   rt[3].setByAngle(-360f);
      pt.setCycleCount(Timeline.INDEFINITE);
      // add body
      Rectangle body = new Rectangle(75, 10,50, 160);
      body.setArcWidth(20);
      body.setArcHeight(20);
      Circle circle = new Circle(100,30, 15);  // front light
      circle.setFill(Color.RED);
      getChildren().addAll(body,circle);
      FadeTransition ft = new FadeTransition(Duration.millis(1000),circle);
      ft.setFromValue(1.0f);
      ft.setToValue(0.3f);
      ft.setAutoReverse(true);
      pt.getChildren().add(ft);
      // arms
      Rectangle[] arms = new Rectangle[4];
      for (i=0; i<4; i++){
         arms[i]= new Rectangle(-6,-6, 110, 12); 
         arms[i].setArcWidth(10);
         arms[i].setArcHeight(10);
         getChildren().add(arms[i]);
      }
      arms[0].setRotate(30);
      arms[0].setTranslateX(-(55-6)*(1-Math.cos(30*Math.PI/180)));
      arms[0].setTranslateY((55-6)*Math.sin(30*Math.PI/180));
      arms[1].setRotate(-30);
      arms[1].setTranslateX(108);
      arms[1].setTranslateY(24);  
      arms[2].setRotate(-30);
      arms[2].setTranslateX(-6);
      arms[2].setTranslateY(176); 
      arms[3].setRotate(30);
      arms[3].setTranslateX(108); 
      arms[3].setTranslateY(176);
      Media media = new Media(MEDIA_URL);
      mediaPlayer = new MediaPlayer(media);
      mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
      mediaPlayer.setVolume(0.1); 
   }
   public void play() {
      pt.play();
      mediaPlayer.play();
   }
   public void pause() {
      pt.pause();
      mediaPlayer.pause();
   }
}
