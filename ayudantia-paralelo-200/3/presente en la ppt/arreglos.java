import java.util.ArrayList;
public class arreglos {
    public static void main(String[] args) {
        /* El formato consiste de:
            ArrayList<tipoDato> nombreArrayList = new ArrayList<tipoDato>();
        */

        ArrayList<empleado> trabajador = new ArrayList<empleado>();
        for (int i = 0; i < 5; i++) {
            empleado e = new empleado(100*i);
            trabajador.add(e);
        }
        System.out.println(trabajador.size()); // 5
        System.out.println(trabajador.get(3).getSalario()); // 300
    }
}
