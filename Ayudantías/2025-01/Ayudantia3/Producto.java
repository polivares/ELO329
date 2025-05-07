public class Producto implements descuento{
    //Atributos
    private String nombreIngrediente;
    private String tipoProducto;
    private int cantidad;
    private boolean secreto;

    //Constructor
    public Producto(String nombreIngrediente, int cantidad, boolean secreto, String tipoProducto){
        this.nombreIngrediente = nombreIngrediente;
        this.cantidad = cantidad;
        this.secreto = secreto;
        this.tipoProducto = tipoProducto;
    }

    //Getters
    public String getNombreIngrediente(){return nombreIngrediente;}

    public int getCantidad(){return cantidad;}

    public boolean getSecreto(){return secreto;}


    //Setters
    public void setNombreIngrediente(String nombre){
        nombreIngrediente = nombre;
    }

    public void setCantidad(int cantidadIngrediente){
        cantidad = cantidadIngrediente;
    }

    public void setSecreto(boolean isSecret){
        secreto = isSecret;
    }

    //Métodos
    public void descontarProducto(int cantidadNecesaria) {
        if (cantidad > cantidadNecesaria) {
            if (!getSecreto()){
                System.out.println(">> Descontando Vegetal: " + nombreIngrediente);
            } else {
                System.out.println((">> Descontando el ingrediente secreto"));
            }
            cantidad = cantidad - cantidadNecesaria;
            checkProducto();
        }else{
            System.out.println(">> ERROR: No hay suficientes unidades para preparar esta crangreburger.");
        }
    }

    public boolean checkProducto(){
        boolean suficiente = true;
        if (cantidad <= 2){
            suficiente = false;
            alertaCantidad();
        }
        return suficiente;
    }

    public void alertaCantidad(){
        if (secreto == false) {
            System.out.println(">> Alerta: Quedan pocas unidades de " + nombreIngrediente + "!!!");
        } else{
            System.out.println(">> Alerta: Quedan pocas unidades del ingrediente secreto!!!");
        }
    }
}
