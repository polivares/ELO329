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
    public class Cocinero {
        //private ArrayList<Producto> inventario;

        //Constructor
        public Cocinero() {
            //this.inventario = new ArrayList<>();
        }
    }

    //Constructor
    public Empleado(String name, String jornada, int sueldoBase){
        this.name = name;
        this.jornada = jornada;
        this.sueldoBase = sueldoBase;
        this.asistencia = 0; //Cuando se instancia, se asume en 0
    }

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

    public int calcularSueldo(){
        int sueldoLiquido = sueldoBase;
        if(jornada.equals("Full-time")){
            int diasMes = 22;
            int diff = asistencia - diasMes;
            if(diff < 0){
                int descuento = ((-diff) * sueldoBase) / diasMes;
                sueldoLiquido = sueldoBase - descuento;
            } else if(diff > 0){
                int pagoXdia = sueldoBase / diasMes;
                int bono = (int)(pagoXdia * 0.25 * diff);
                sueldoLiquido = sueldoBase + pagoXdia*diff + bono;
            }
        } else if(jornada.equals("Part-time")){
            int diasMes = 12;
            int diff = asistencia - diasMes;
            if(diff > 0){
                int pagoXdia = sueldoBase / diasMes;
                int bono = (int)(pagoXdia * 0.25 * diff);
                sueldoLiquido = sueldoBase + pagoXdia*diff + bono;
            }
        }
        return sueldoLiquido;
    }
}
