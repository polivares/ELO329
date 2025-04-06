public class Vegetal extends Producto{

    //Constructor
    public Vegetal(String nombreIngrediente, int cantidad, boolean secreto){
        super(nombreIngrediente, cantidad, secreto);
    }

    @Override
    public void descontarProducto(int cantidadNecesaria) {
        int cantidadActual = getCantidad();
        String nombre = getNombreIngrediente();

        if (cantidadActual > cantidadNecesaria) {
            if (!getSecreto()){
                System.out.println(">> Descontando Vegetal: " + nombre);
            } else {
                System.out.println((">> Descontand el ingrediente secreto"));
            }
            setCantidad(cantidadActual - cantidadNecesaria);
            checkProducto();
        }else{
            System.out.println(">> ERROR: No hay suficientes unidades para preparar esta crangreburger.");
        }
    }
}
