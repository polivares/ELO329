/**
   @version 2014
   @author Agustín J. González
*/


public class SecondSample
{
    /**
     * Toda aplicación Java tiene un main
     * @param args Arreglo de string con los argumentos
     * de la línea de comando.
     */
  public static void main(String[ ] args)
    {
        /* Para salidas de texto usar el método println del objeto out
           de la clase System. La sintaxis de acceso es como las estructuras
           de C, aquí no sólo tenemos campos datos sino también funciones.*/
      System.out.println("A continuación haremos manipulaciones básicas con Puntos");
      Punto p1 = new Punto(); // (0,0)
      System.out.println("p1="+p1.toString());
      Punto p2 = new Punto(3,5); // (3,5)
      System.out.println("p2="+p2.toString());
      Punto p3 = new Punto(3,5); // (3,5)
      System.out.println("p3="+p3.toString());
      if (p1.equals(p3)) 
          System.out.println("p1 = p3"); 
      else
          System.out.println("p1 != p3");
      if (p2.equals(p3)) 
          System.out.println("p2 = p3, Usando equals"); 
      else
          System.out.println("p2 != p3, Usando equals");
      if (p2 == p3) 
          System.out.println("p2 = p3, Usando =="); 
      else
          System.out.println("p2 != p3, Usando ==");
    }
}
