public class otest {
    
    static public void contar_cosas(Object[] _arreglo){
        int contador_bloques = 0;
        for (int i = 0; i < _arreglo.length; i++) {
            if(_arreglo[i].getClass().getName() == "bloque")
                contador_bloques++;
        }
        System.out.println("Hay una cantidad de "+contador_bloques + " bloques");
    }

    public static void main(String[] args) {        
        Object[] cosas = new Object[15];
        for (int i = 0; i < cosas.length; i++) {
            if(i<6){
                cosas[i] = new bloque();
            }
            else if(i>=6 && i <10)
                cosas[i] = new bloque();
            else
                cosas[i] = new empleado(500);
                
        }
        
        otest.contar_cosas(cosas);        
    }
}
