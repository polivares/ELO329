class Linea 
{
  private Punto puntoi, puntof;
  public Linea ()
    {
      puntoi = new Punto();
      puntof = new Punto();
    }
  
  public Linea (Punto i, Punto f)
    {
      puntoi=i;
      puntof=f;
    }

  public Linea(int x1, int y1, int x2, int y2)
    {
      puntoi = new Punto(x1,y1);
      puntof = new Punto(x2,y2);
    }
  
  public float pendiente()
    {
      if (puntof.getX()!=puntoi.getX())
        return (float)(puntof.getY()-puntoi.getY())/
          (puntof.getX()-puntoi.getX());
      else
        return (1E+38F); // evitar "números mágicos". Mucho mejor es usar Float.MAX_VALUE
    }
  
  public  boolean esParalelaA (Linea L)
    {
      return pendiente()==L.pendiente();
    }
  
  public boolean esPerpendicularA(Linea L)
    {
      return pendiente()*L.pendiente()==-1;
    }
  public float cruceOrdenada() 
    {
      return (puntoi.getY()-puntoi.getX()*pendiente());
    }
  
  public String toString (){
    return ("Pendiente =" + pendiente() + " Cruce ordenada=" + cruceOrdenada());
  }
  
      
    /* Ejercicio, implementar
    public Punto interseccion (Linea L)
    {
      
    }
    */
}
