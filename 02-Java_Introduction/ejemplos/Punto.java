/* ¿Qué pasa si este archivo no se nombra Punto.java? Pruebe*/
class Punto 
{
  private int x,y;

  public Punto(){  /* Al no usar parámetros, lo definimos en origen */
    x=y=0;
  }
  public Punto(int _x, int _y){  /*Posición definida en su creación */
    x=_x;
    y=_y;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public boolean equals(Punto p){   /* equals simple, más adelante veremos más*/
    if (p== null) return false;
    return ((x==p.getX()) && (y==p.getY()));
  }
  public String toString() {  /* Para generar versión string para lectura */
    return("(" + x +", "+y+")");
  }
}
