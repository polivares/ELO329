public class gerente extends empleado{

    gerente(int _sueldo, int _bonomarzo){
        super(_sueldo);
        bonomarzo = _bonomarzo;
    }

    public int getSueldo(){
        return sueldo+bonomarzo;
    }
    
    private int bonomarzo;
}