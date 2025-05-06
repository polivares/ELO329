import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Parte 1: Sensor de Plankton
        Sensor sensor = new Sensor();
        sensor.add(() -> System.out.println("Alerta: Plankton detectado!"));
        System.out.println("== Parte 1: Detección de Plankton ==");
        sensor.detect();

        // Uso de la clase Empleado
        Empleado[] staff = new Empleado[2];
        staff[0] = new Empleado("Bob Esponja", "Part-time", 250000);

        // Instanciar Cocinero
        Empleado.Cocinero cocinero = staff[0].new Cocinero();

        // Parte 2: Autenticación con bloqueo de la app
        AuthenticationService auth = new AuthenticationService(sensor);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n== Parte 2: Autenticación ==");
        while (true) {
            try {
                System.out.print("Ingrese contraseña: ");
                String pwd = scanner.nextLine();
                auth.authenticate(pwd);
                System.out.println("Acceso concedido.");
                break;
            } catch (AppLockedException e) {
                System.out.println(e.getMessage());
                while (auth.isLocked()) {
                    System.out.print("Ingrese código de desbloqueo: ");
                    String code = scanner.nextLine();
                    auth.unlock(code);
                }
            } catch (AuthenticationService.InvalidCredentialsException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Aplicación funcionando normalmente.");
    }
}
