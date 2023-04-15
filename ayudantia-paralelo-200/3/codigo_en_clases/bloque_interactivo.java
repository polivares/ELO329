public class bloque_interactivo extends bloque{
    bloque_interactivo(int id_ingresado){
        super(id_ingresado);
    }
    bloque_interactivo(){
        super();
    }

    public void interactuar(){
        System.out.println("ola estoy interactuando");
    }
}
