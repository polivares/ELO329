public abstract class Producto {
    //Atributos
    private String nombreIngrediente;
    private int cantidad;
    private boolean secreto;

    //Constructor
    public Producto(String nombreIngrediente, int cantidad, boolean secreto){
        this.nombreIngrediente = nombreIngrediente;
        this.cantidad = cantidad;
        this.secreto = secreto;
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

    //Métodos que debe implementar.
    public abstract void descontarProducto(int cantidadNecesaria);

    //Métodos
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

    public void mostrarInventario(Empleado solicitante){
        if(solicitante.getJob().equals("Cocinero")){
            if(!secreto) {
                System.out.println(">> Ingrediente: " + nombreIngrediente + " Cantidad: " + cantidad);
            } else{
                System.out.println(">> Ingrediente: secreto Cantidad: " + cantidad);
            }
        }else if(solicitante.getJob().equals("Jefe Jefazo")){
            System.out.println(">> Ingrediente: " + nombreIngrediente + " Cantidad: " + cantidad);
        }
    }
}
