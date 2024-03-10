/** Este programa muestra como efectuar entrada de datos. 
	Hay otras formas mas generales, pero esta es simple.
	*/
/**
   @version 1.00 2000-01-07
   @author Cay Horstmann
*/
/*
	import toma + o - el rol de los include de C.
	En import se especifican los paquetes que usaremos
	en el programa. De esta forma podemos referirinos a
	las funciones del paquete en forma corta. En lugar 
	de: javax.swing.JOptionPane.showInputDialog, ssolo usamos
	JOptionPane.showInputDialog
	javax.swing es un paquete con todo tipo de elementos graficos.
	se invita a correr el demo de swing que viene con el SDK.
*/
import javax.swing.*;

public class InputTest
{  
   public static void main(String[] args)
   {  
      // get first input
      String name = JOptionPane.showInputDialog("What is your name?");

      // get second input
      String input = JOptionPane.showInputDialog("How old are you?");

      // convert string to integer value
      int age = Integer.parseInt(input);

      // display output on console
		/* Notar como se puede concatenar string.
		cuando el dato no es string, java lo pasa
		a string invocando inplicitamente el metodo toString()
		*/
      System.out.println("Hello, " + name +
         ". Next year, you'll be " + (age + 1));
	/* Swing genera multiples hilos, para garantizar que todos terminen
		debemos llamar a System.exit() para terminar.
	*/
      System.exit(0);
   }
}
