import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {

    public static void main(String[] args) {
        // Creamos propiedades a partir de las clases definidas como
        // propiedades
        DoubleProperty d1 = new SimpleDoubleProperty(1.0);
        DoubleProperty d2 = new SimpleDoubleProperty(2.0);
        // Una vez definidas dichas propiedades, puedes "conectarlas"
        // Utilizando el método bind, definido en todas las propiedades
        d1.bind(d2); // Estás conectando el valor de d1 a la propiedad d2
        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());
        d2.setValue(70.2);
        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());
        d1.setValue(5.5);  // This change is not allowed, compiler will send an error
        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());
    }
}
