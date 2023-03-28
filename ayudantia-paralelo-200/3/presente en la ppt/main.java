public class main {
    public static void main(String[] args) {
        empleado[] empleados = new empleado[2];
        empleados[0] = new gerente(1500, 1000);
        empleados[1] = new empleado(1500);
        System.out.println(empleados[0].getSalario());
    }
}
