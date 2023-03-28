public class gerente extends empleado {
    gerente(int _sueldo, int _bonomarzo){
        super(_sueldo);
        bonomarzo = _bonomarzo;
    }
    gerente(int _sueldo){
        super(_sueldo);
    }
    public int getSalario(){
        return (super.getSalario()+bonomarzo);
    }
    private int bonomarzo=0;
}
