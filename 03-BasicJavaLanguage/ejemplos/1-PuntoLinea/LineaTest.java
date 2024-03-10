class LineaTest
{
  public static void main(String[ ] args)
    {
      Punto a = new Punto();
      Punto b = new Punto(5,2);
      Punto c = new Punto(5,1);
      
      Linea L1= new Linea(a,b);
      Linea L2= new Linea(b,a);

      System.out.println("a=" + a);
      System.out.println("b=" + b);
      System.out.println("c=" + c);
      System.out.println("L1=" + L1);
      System.out.println("L2=" + L2);
      
      if (c.equals(b)) System.out.println("c y b son iguales");
      else System.out.println("c y b son distintos");
      if (c.equals(a)) System.out.println("c y a son iguales");
      else  System.out.println("c y a son distintos");
      
      if (L1.esParalelaA(L2))
        System.out.println("Son paralelas");
      else
        if( L1.esPerpendicularA(L2))
          System.out.println("Son perpendiculares");
        else
          System.out.println("No son paralelas ni perpendiculares");
      
      Linea L3= new Linea(b, new Punto(3,11));

      if (L2.esParalelaA(L3))
        System.out.println("Son paralelas");
      else
        if( L2.esPerpendicularA(L3))
          System.out.println("Son perpendiculares");
        else
          System.out.println("No son paralelas ni perpendiculares");

      L1 = new Linea(a, new Punto(2,2));

      if (L1.esParalelaA(L3))
        System.out.println("Son paralelas");
      else
        if( L1.esPerpendicularA(L3))
          System.out.println("Son perpendiculares");
        else
          System.out.println("No son paralelas ni perpendiculares");
    }    
}
