import javax.swing.*;
import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        //Empleados
        Empleado[] staff = new Empleado[3];
        staff[0] = new Empleado("Bob Esponja", "Cocinero", "Part-time", 250000);
        staff[1] = new Empleado("Calamardo Tentáculos", "Cajero", "Full-time", 600000);
        staff[2] = new Empleado("Don Cangrejo", "Jefe Jefazo", "Full-time", 0);

        //ArrayList del inventario
        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Lacteo("Queso Cheddar", 5, false));
        inventario.add(new Lacteo("Queso Mozarella", 10, false));
        inventario.add(new Vegetal("Lechuga", 9, false));
        inventario.add(new Vegetal("Tomate", 13, false));
        inventario.add(new Vegetal("Pepinillos", 9, false));
        inventario.add(new Pan("Pan de sésamo", 15, false));
        inventario.add(new Carne("Hamburguesa de cangrejo", 17, true));

        int cantidadIngredientes = inventario.size();

        System.out.print(">> Bienvenido, por favor identifíquese con su nombre:");
        String nombreEmpleado = scn.nextLine();
        Empleado login = null;

        //Buscar empleado:

        for (int indice = 0; indice < 3; indice++) {
            if (staff[indice].getName().equals(nombreEmpleado)) {
                login = staff[indice];
            }
        }

        boolean salir = false;

        //Si el emplado no existe
        if (login == null) {
            System.out.println(">> Buen intento Plankton!!! GG EZ");
            salir = true;
        }

        while (!salir) {
            //Verificación cocinero
            if(login.getJob().equals("Cocinero")){
                interfaz();

                int seleccion = scn.nextInt();
                scn.nextLine();
                //Preparar cangreburger clasica
                if(seleccion== 1){

                    /* Arreglo con las cantidades de cada ingrediente en el siguiente orden.
                    [cheddar, mozarella, lechuga, tomate, pepinillos, pan, hamburguesa]
                     */
                    int [] nInrediente = {1, 0, 1, 1, 1, 1, 1};

                    for(int i = 0; i < inventario.size(); i++){
                        inventario.get(i).descontarProducto(nInrediente[i]);
                    }
                    //Preparar doble cangreburger
                } else if(seleccion == 2){

                    int [] nIngrediente = {1, 0, 1, 1, 1, 1, 2};

                    for(int i = 0; i < inventario.size(); i++){
                        inventario.get(i).descontarProducto(nIngrediente[i]);
                    }
                    //Preparar CangreVegan
                } else if(seleccion == 3){

                    int [] nIngrediente = {0, 0, 1, 1 ,1, 1, 0};

                    for(int i = 0; i < inventario.size(); i++){
                        inventario.get(i).descontarProducto(nIngrediente[i]);
                    }
                    //Preparar CangreCheeese
                } else if(seleccion== 4){

                    int [] nIngrediente = {1, 1, 1, 1, 1, 1, 1};

                    for(int i = 0; i < inventario.size(); i++){
                        inventario.get(i).descontarProducto(nIngrediente[i]);
                    }
                } else{
                    salir = true;
                }

            System.out.println("---------------------------------------------------------------\t");
            for(int pos = 0; pos < inventario.size(); pos++){
                inventario.get(pos).mostrarInventario(login);
            }
            } else if(login.getJob().equals(("Jefe Jefazo"))){
                System.out.println("---------------------------------------------------------------\t");
                for(int pos = 0; pos < inventario.size(); pos++){
                    inventario.get(pos).mostrarInventario(login);
                }
                salir = true;
            } else{
                System.out.println(">> ERROR: No estás autorizado para ver el inventario, saliendo del programa...");
                salir = true;
            }
        }
    }

    public static void interfaz(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t>> 1. Cangreburger clásica");
        System.out.println("\t>> 2. Doble Cangreburger");
        System.out.println("\t>> 3. CangreVegan");
        System.out.println("\t>> 4. CangreCheese");
        System.out.println("\t>> Otro: Salir");

    }

}