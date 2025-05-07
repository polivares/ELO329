/*
* Clase empleado, donde los atributos de interés son el nombre, el cargo, la jornada, la asistencia
* y la jornada que cumple el empleado.
* */

import java.util.ArrayList;
import java.util.HashMap;

public class Empleado {
    private String name;
    private String jornada;
    private int sueldoBase;
    private int asistencia;

    /*Clase interna cocinero, incluirá el inventario,
    de forma que solo el cocinero tenga acceso a el.
     */
    public class Cocinero{
        private ArrayList<Producto> inventario;
        //Constructor
        public Cocinero(){
            this.inventario = new ArrayList<>();
        }
        //Métodos
        public void agregarProducto(String nombre, int cantidad, boolean secreto, String tipo){
            inventario.add(new Producto(nombre, cantidad, secreto, tipo));
        }

        public void cocinar(){
            System.out.println("Listado de cangreburgers:");
            System.out.println("\t\t>> 1.- Cangreburger clásica.");
            System.out.println("\t\t>> 2.- Doble Cangreburger.");
            System.out.println("\t\t>> 3.- CangreVegan.");
            System.out.println("\t\t>> 4.- CangreCheese.");

            System.out.print("\n\t>> Ingrese el id de la cangreburger que va a cocinar: ");
            int seleccion = Main.scn.nextInt();
            Main.scn.nextLine();

            //Cangreburger clásica

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
            }
        }
    }

    public class Cajero{
        //Es más simple implementar las ventas utilizando un HashMap, que funcionan con pares clave - valor
        //Son el equivalente a los diccionarios de python
        //Documentación HashMap: https://www.w3schools.com/java/java_hashmap.asp
        private HashMap<String, Integer> pedidos;

        //Constructor
        public Cajero(){
            pedidos = new HashMap<String, Integer>();
            //Inicialización en 0
            pedidos.put("Cangreburger Clásica", 0);
            pedidos.put("Doble Cangreburger", 0);
            pedidos.put("CangreVegan", 0);
            pedidos.put("CangreCheese", 0);
        }

        //Métodos

        public void atender(){
            System.out.println("\t>> Menu:");
            System.out.println("\t\t>> 1. Cangreburger Clásica");
            System.out.println("\t\t>> 2. Doble Cangreburger");
            System.out.println("\t\t>> 3. CangreVegan");
            System.out.println("\t\t>> 4. CangreCheese");
            System.out.print("\n\t>> Ingrese hamburguesa: ");

            int seleccion = Main.scn.nextInt();
            Main.scn.nextLine();

            //Cangreburger clásica
            if(seleccion == 1){
                int cantidadVendida = pedidos.get("Cangreburger Clásica");
                pedidos.put("Cangreburger Clásica", cantidadVendida + 1);
                System.out.println(">> Cangreburger Clásica vendida");

            } else if(seleccion == 2){
                int cantidadVendida = pedidos.get("Doble Cangreburger");
                pedidos.put("Doble Cangreburger", cantidadVendida + 1);
                System.out.println(">> Doble Cangreburger vendida");

            } else if(seleccion == 3){
                int cantidadVendida = pedidos.get("CangreVegan");
                pedidos.put("CangreVegan", cantidadVendida + 1);
                System.out.println(">> CangreVegan vendida");

            } else if(seleccion == 4){
                int cantidadVendida = pedidos.get("CangreCheese");
                pedidos.put("CangreCheese", cantidadVendida + 1);
                System.out.println(">> CangreCheese vendida");
            }
        }

        public void reporte(){
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("\t>> REPORTE VENTAS");
            System.out.println("\n\t\t>> Cangreburgers Clásicas vendidas: " + pedidos.get("Cangreburger Clásica"));
            System.out.println("\t\t>> Doble Cangreburgers vendidas: " + pedidos.get("Doble Cangreburger"));
            System.out.println("\t\t>> CangreVegan vendidas: " + pedidos.get("CangreVegan"));
            System.out.println("\t\t>> CangreCheese vendidas: " + pedidos.get("CangreCheese"));
            System.out.println("\n----------------------------------------------------------------------------");
        }
        

    }
    //Constructor
    public Empleado(String name, String jornada, int sueldoBase){
        this.name = name;
        this.jornada =  jornada;
        this.sueldoBase = sueldoBase;
        this.asistencia = 0; //Cuando se instancia, se asume en 0
    }

    //Setters
    public void setAsistencia(int diasAsistidos){asistencia = diasAsistidos;}

    public void setName(String nombre){ name = nombre;}

    public void setJornada(String jornadaLaboral){ jornada = jornadaLaboral;}

    public void setSueldoBase(int sueldo){ sueldoBase = sueldo;}

    //Getters
    public String getName(){
        return name;
    }

    public String getJornada() {
        return jornada;
    }

    public int getSueldoBase(){
        return sueldoBase;
    }

    public int getAsistencia(){
        return asistencia;
    }

    //Métodos
    public void aumentarAsistencia(int asistenciaSemanal){
        asistencia += asistenciaSemanal;
    }

    public void printEmpleado(){
        System.out.println("\t>> Nombre del empleado: " + name);
        System.out.println("\t>> Jornada laboral del empleado: " + jornada);
        System.out.println("\t>> Sueldo base del empleado: " + sueldoBase);
        System.out.println("\t>> Asistencia dentro del mes: " + asistencia);

    }

    public int calculoSueldoLiquido(){
        int sueldoLiquido = sueldoBase;

        //Jornada full-time
        if (jornada.equals("Full-time")){
            //Asistencia mayor al 90% (18 días al mes)
            if (asistencia >= 18){
                int bono = (int)(sueldoBase*0.1);
                sueldoLiquido = sueldoBase + bono;

            //Asistencian mayor al 80% (16 días al mes)
            } else if (asistencia >= 16) {
                int bono = (int)(sueldoBase * 0.05);
                sueldoLiquido = sueldoBase + bono;

            //Asistencia menor al 60% (12 días al mes)
            } else if(asistencia <= 12){
                int descuento = (int)(sueldoBase*0.3);
                sueldoLiquido = sueldoBase - descuento;
            }

         //Jornada laboral part-time
        } else if(jornada.equals("Part-time")){
            int diasMes = 12;
            int diff = asistencia - diasMes;

            //Caso en que el part time trabajó jornadas extras.
            if (diff > 0){
                int pagoXdia = sueldoBase / diasMes;
                int bono = (int)(pagoXdia * 0.25 * diff);
                sueldoLiquido = sueldoBase + pagoXdia*diff + bono;
            }
        }
        return sueldoLiquido;
    }


}
