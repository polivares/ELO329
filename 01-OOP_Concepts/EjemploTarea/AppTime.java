public class AppTime {
   static {
      t0=System.currentTimeMillis();  // time in ms since app 1970.
   }
   public static long t0; 
   public static float getCurrentTime(){  // time since program started in [s]
      return (float)(System.currentTimeMillis()-t0)/1000.0f;
   }
}