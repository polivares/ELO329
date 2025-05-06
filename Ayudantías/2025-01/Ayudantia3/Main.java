import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear empleados
        Empleado[] staff = new Empleado[2];
        staff[0] = new Empleado("Bob Esponja", "Part-time", 250000);
        staff[1] = new Empleado("Calamardo Tentáculos", "Full-time", 600000);

        // Instanciar Cocinero y Cajero
        Empleado.Cocinero cocinero = staff[0].new Cocinero();
        Empleado.Cajero cajero = staff[1].new Cajero();

        // Inicializar inventario
        cocinero.agregarProducto("Queso Cheddar", 5, false, "Lácteo");
        cocinero.agregarProducto("Queso Mozarella", 10, false, "Lácteo");
        cocinero.agregarProducto("Lechuga", 9, false, "Vegetales");
        cocinero.agregarProducto("Tomate", 13, false, "Vegetales");
        cocinero.agregarProducto("Pepinillos", 9, false, "Vegetales");
        cocinero.agregarProducto("Pan de sésamo", 15, false, "Panes");
        cocinero.agregarProducto("Hamburguesas de cangrejo", 17, true, "Carnes");

        // Variables de control
        boolean salir = false;

        // Menú interactivo
        while (!salir) {
            System.out.println("\n----------------------------------------------------------");
            System.out.println("\t>> Menú Principal");
            System.out.println("\t\t1. Cocinar hamburguesa");
            System.out.println("\t\t2. Atender cliente");
            System.out.println("\t\t3. Ver reporte de ventas");
            System.out.println("\t\t4. Ver información empleados");
            System.out.println("\t\t5. Salir");
            System.out.print("\t>> Seleccione una opción: ");

            int opcion = scn.nextInt();
            scn.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    cocinero.cocinar();
                    break;
                case 2:
                    cajero.atender();
                    break;
                case 3:
                    cajero.reporte();
                    break;
                case 4:
                    System.out.println("\n>> Información de empleados:");
                    for (Empleado emp : staff) {
                        emp.printEmpleado();
                        System.out.println("\t>> Sueldo líquido: $" + emp.calculoSueldoLiquido());
                        System.out.println();
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println(">> Opción inválida. Intente nuevamente.");
            }
        }

        // Al salir, reporte final
        System.out.println("\n===================================================================");
        System.out.println(">> REPORTE FINAL");
        System.out.println("\n>> Sueldos liquidados:");
        for (Empleado emp : staff) {
            System.out.println("\t- " + emp.getName() + ": $" + emp.calculoSueldoLiquido());
        }

        System.out.println("\n>> Ventas realizadas:");
        cajero.reporte();
        
        System.out.println(">> Fin del programa.");
    }
}

