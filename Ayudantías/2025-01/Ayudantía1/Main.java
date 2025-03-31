import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner para input por CLI.
        Scanner scn = new Scanner(System.in);
        //Arreglo de empleados
        Empleado[] staff = new Empleado[2];

        System.out.println(">> Bienvenido Don Cangrejo!!!");
        Boolean salir = false;

        //Ciclo principal, se encarga de la ejecución principal.
        while (!salir) {
            menuInteractivo();
            System.out.print("\t>> Elección: ");
            String choice = scn.nextLine();

            //Creación de empleados
            if (choice.equals("1")) {
                int cont = 0;
                while (cont < 2) {
                    String nombre, cargo, jornada;
                    int sueldo;
                    System.out.print("\t\t>> Ingrese el nombre del empleado " + (cont + 1) + ": ");
                    nombre = scn.nextLine();
                    System.out.print("\t\t>> Ingrese el cargo del empleado " + (cont + 1) + ": ");
                    cargo = scn.nextLine();
                    System.out.print("\t\t>> Ingrese la jornada laboral del empleado " + (cont + 1) + ": ");
                    jornada = scn.nextLine();
                    System.out.print("\t\t>> Ingrese el sueldo del empleado " + (cont + 1) + ": ");
                    sueldo = scn.nextInt();

                    //Limpieza del buffer
                    scn.nextLine();
                    staff[cont] = new Empleado(nombre, cargo, jornada, sueldo);
                    System.out.println("\n------------------------------------------------------------------");
                    cont++;
                }
            //Actualizar asistencia
            } else if (choice.equals("2")) {
                for (int i = 1; i <= 4; i++) {
                    System.out.print("\t>> Ingrese cuantos dias trabajó " + staff[0].getName() + " durante la semana " + i + ": ");
                    int asistenciaSemanal = scn.nextInt();
                    staff[0].aumentarAsistencia(asistenciaSemanal);
                    //Limpieza del buffer.
                    scn.nextLine();

                    System.out.print("\t>> Ingrese cuantos dias trabajó " + staff[1].getName() + " durante la semana " + i + ": ");
                    asistenciaSemanal = scn.nextInt();
                    staff[1].aumentarAsistencia(asistenciaSemanal);
                    //Limpieza del buffer.
                    scn.nextLine();
                    System.out.println("\n------------------------------------------------------------------");

                }
            //Imprimir empleados
            } else if (choice.equals("3")){
                staff[0].printEmpleado();
                System.out.println("\n------------------------------------------------------------------");
                staff[1].printEmpleado();

            //Calcular sueldos
            } else if (choice.equals("4")){
                int sueldoLiquido = staff[0].calculoSueldoLiquido();
                System.out.println("\t>> Sueldo de " + staff[0].getName() + ": " + sueldoLiquido);
                sueldoLiquido = staff[1].calculoSueldoLiquido();
                System.out.println("\t>> Sueldo de " + staff[1].getName() + ": " + sueldoLiquido);

            //Salir
            }else if(choice.equals("DC")){
                salir = true;

            //Entrada inválida.
            } else{
                System.out.println("\t>> ERROR: La entrada no es válida!!!, intente nuevamente.");
            }
        }
        System.out.println(">> Adios Don Cangrejo!!!");
    }

    //Método de main  que muestra el menú interactivo
    public static void menuInteractivo(){
        System.out.println("\n------------------------------------------------------------------");
        System.out.println(">> Seleccione alguna de las opciones: ");
        System.out.println("\t>> 1.- Creación de empleados.");
        System.out.println("\t>> 2.- Actualizar asistencia semanal.");
        System.out.println("\t>> 3.- Mostrar empleados.");
        System.out.println("\t>> 4.- Calcular sueldo.");
        System.out.println("\t>> DC: Salir");
        System.out.println("\n------------------------------------------------------------------");
    }
}