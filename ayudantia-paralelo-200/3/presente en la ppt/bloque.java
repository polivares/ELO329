public class bloque {
    protected int id;
    bloque(int _id){
        id = _id;
    }
    bloque(){
        id = 0;
    }

    public void interactuar(){
        System.out.println("ola estoy bloqueando");
    }
}
