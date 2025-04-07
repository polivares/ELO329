public class Estudiante {
    private String nombre;
    private int id;

    Estudiante(String n, int i){
        nombre = n;
        id = i;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        Estudiante e = (Estudiante) obj;
        return this.nombre.equals(e.nombre) &&
                this.id == e.id;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " id: " + id;
    }
}
