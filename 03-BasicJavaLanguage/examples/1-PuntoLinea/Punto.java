class Punto 
{
  private int x,y;

  public Punto(){
    x=y=0;
  }
  public Punto(int _x, int _y){
    x=_x;
    y=_y;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public boolean equals(Punto p){
    if (p== null) return false;
    return ((x==p.getX()) && (y==p.getY()));
  }
  public String toString() {
    return("(" + x +", "+y+")");
  }
}
