/**
   @version First version 1.01 1997-03-22
   @author Gary Cornell
*/

/* 
   This is the first sample program in Core Java Chapter 3
   Copyright (C) 1997 Cay Horstmann and Gary Cornell
*/
/**
   En java todo debe formar parte de alguna clase.
   Una clase es la la descripción de una categoría de 
   elementos abstractos o reales de un mismo tipo en nuestra solución.
   Toda clase se compone de funciones o métodos (miembro función)
   y datos o atributos (miembros datos).
   
   Dentro de un archivo podemos definir varias clase, pero sólo aquella
   con nombre igual al archivo que la contiene (que además debe tener extensión .java)
   es visible desde fuera del archivo.
   En este caso el archivo debe llamarse FirstSample.java
   (probar qué pasa si lo llamas de otra forma.)
   
   Notación: Es una buena norma usar Mayúscula en la primera letra
   del nombre de cada clase.
   
   Toda aplicación java debe tener el método main como método de una 
   clase.
   El formato del método main es fijo y como el mostrado.
*/

public class FirstSample
{
    /**
     * Toda aplicación Java tiene un main
     * @param args Arreglo de string con los argumentos
     * de la línea de comando.
     */
  public static void main(String[ ] args)
    {
        /* para salidas de texto usar el método println del objeto out
           de la clase System. La sintaxis de acceso es como las estructuras
           de C, aquí no sólo tenemos campos datos sino también función*/
      System.out.println("'Hello, Sansanos!. You are all welcome to ELO329'");
    }
}
