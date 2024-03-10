import java.io.*;
import java.util.Scanner;

public class InputExample 
{
  public static void main(String  args[]) throws IOException 
    {
	Scanner s= new Scanner (System.in);
      System.out.print("Ingrese su estatura en metros: ");
      float height = s.nextFloat();
      System.out.print("Ingrese su peso en kg: ");
      float weight = s.nextFloat();
      float imc = weight/(height*height);
      System.out.println("Su índice de masa corporal es "+imc+".");
    }
}

      
