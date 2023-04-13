import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.binding.DoubleBinding;
 
public class BindingAddDemo {
   public static void main(String[] args) {
      DoubleProperty num1 = new SimpleDoubleProperty(3.0);
      DoubleProperty num2 = new SimpleDoubleProperty(7.0);
      DoubleBinding sum = num1.add(num2);
      System.out.println("sum is : "+sum.getValue());
      num1.set(5.0);
      System.out.println("Now sum is : "+sum.getValue());
   }
}