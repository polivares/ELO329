public class Rectangle
{
   public void setWidth(double w) {
      itsWidth = w;
   }
   public void setHeight(double h) {
      itsHeight = h;
   }
   public double getHeight() {
      return itsHeight;
   }
   public double getWidth() {
      return itsWidth;
   }
   private double itsWidth;
   private double itsHeight;
}


class Square extends Rectangle
{
   public void setWidth(double w) {
   	super.setWidth(w);
   	super.setHeight(w);  // efecto lateral inesperado
   }
   public void setHeight(double h) {
   	super.setWidth(h);  // efecto lateral inesperado
   	super.setHeight(h);
   }
// pero no resuelve el problema, porque en 
// otro método:podemos tener void XX(Rectangle r)
// y dentro de éste algo como:
/*
   void XX (Rectangle r) {
		r.setWidth(5);
		r.setHight(4);
		if (r.getHight()+r.getWidth() == 9) 
			System.out.println("Asignación correcta");
	}
*/
}