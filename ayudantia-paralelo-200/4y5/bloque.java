public class bloque {
    bloque(){
        id = contador;
        contador++;
    }

    int getId(){
        return id;
    }
    
    static int contador = 0;
    private int id;
}
