import java.util.Scanner; //se importa scanner para probar las entradas
import java.util.Random; //se importa random para ocupar un número random

public class adivinar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int numero_random = random.nextInt(1000);
        System.out.println("Ingresa un número: ");
        int numerito_a_ingresar; 
        while(true)
        {
            numerito_a_ingresar = scan.nextInt();
            if(numerito_a_ingresar > numero_random)
                System.out.println("Estás muy arriba, elige un número más chico.");

            else if(numerito_a_ingresar < numero_random){
                System.out.println("Estás muy abajo, elige un número más grande.");
            }

            else {
                System.out.println("Has adivinado el número");
                break;
            }
        }
    }
}