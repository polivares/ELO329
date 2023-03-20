import java.io.*;
import java.util.Scanner;

public class InputErrorExample 
{
  public static void main(String  args[]) throws IOException 
    {
      Scanner s = new Scanner (System.in);
      System.out.print("Ingrese su estatura en metros: ");
      while(!s.hasNextFloat()){
        s.nextLine();
        System.out.print("Ese no es un real, ingrese un número real por favor:");
      }
      float height = s.nextFloat();
      System.out.print("Ingrese su peso en kg: ");
      float weight = s.nextFloat();
      float imc = weight/(height*height);
      System.out.println("Su índice de masa corporal es "+imc+".");
    }
}

      
