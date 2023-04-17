public class empleado {

    empleado(int _sueldo){
        sueldo = _sueldo;
        id = contador;
        contador++;
    }
    
    public int getSueldo(){
        return sueldo;
    }

    public int getId(){
        return id;
    }

    static int contador = 0;
    protected int id;
    protected int sueldo;
}
