public class Pan extends Producto{
    //Constructor
    public Pan(String nombreIngrediente, int cantidad, boolean secreto){
        super(nombreIngrediente, cantidad, secreto);
    }


    @Override
    public void descontarProducto(int cantidadNecesaria) {
        int cantidadActual = getCantidad();
        String nombre = getNombreIngrediente();

        if (cantidadActual > cantidadNecesaria) {
            if (!getSecreto()){
                System.out.println(">> Descontando Pan: " + nombre);
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