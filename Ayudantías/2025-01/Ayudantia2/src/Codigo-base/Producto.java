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
    public abstract void descontarProducto();
    
        //Métodos
    public boolean checkProducto(){

    }

    public void alertaCantidad(){

    }

    public void mostrarInventario(Empleado solicitante){

}
  
