// base del juego de gato
public class gato{
    public static void main(String[] args) {
        int[][] juego_gato = new int[3][3];
        /*
         1|1|1 (dimensión 1)
         1|1|1
         1|2|2
         */
        if((juego_gato[0][0]==1 && juego_gato[1][0]==1 && juego_gato[2][0]==1) || juego_gato[0][0]==0 && juego_gato[1][0]==0 && juego_gato[2][0]==0){
            System.out.println("El jugador "+ juego_gato[0][0] +" ganó");
        }
        else if((juego_gato[0][1]==1 && juego_gato[1][0]==1 && juego_gato[2][0]==1) || juego_gato[0][0]==0 && juego_gato[1][0]==0 && juego_gato[2][0]==0){
            System.out.println("El jugador "+ juego_gato[0][0] +" ganó");
        }
    }
}
