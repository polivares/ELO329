/*
* Clase empleado, donde los atributos de interés son el nombre, el cargo, la jornada, la asistencia
* y la jornada que cumple el empleado.
* */

public class Empleado {
    private String name;
    private String job;
    private String jornada;
    private int sueldoBase;
    private int asistencia;

    //Constructor
    public Empleado(String name, String job, String jornada, int sueldoBase){
        this.name = name;
        this.job = job;
        this.jornada =  jornada;
        this.sueldoBase = sueldoBase;
        this.asistencia = 0; //Cuando se instancia, se asume en 0
    }

    //Setters
    public void setAsistencia(int diasAsistidos){asistencia = diasAsistidos;}

    public void setName(String nombre){ name = nombre;}

    public void setJob(String cargo){ job = cargo;}

    public void setJornada(String jornadaLaboral){ jornada = jornadaLaboral;}

    public void setSueldoBase(int sueldo){ sueldoBase = sueldo;}

    //Getters
    public String getName(){
        return name;
    }

    public String getJob(){
        return job;
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
        System.out.println("\t>> Cargo del empleado: " + job);
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
