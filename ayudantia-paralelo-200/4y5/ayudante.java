public class ayudante extends empleado implements estudiante {
    
    ayudante(int _sueldo, String _rol, int _u){
        super(_sueldo);
        rol = _rol;
        u = _u;
    }

    @Override //le indica al compilador que se está re-implementando el método
    public int getId_u() {
        
        return u;
    }
    
    @Override //esto, con el propósito de prevenir confusiones por mal código
    public String getRol() {
        return rol;
    }

    private String rol;
    private int u;

    public static void main(String[] args) {
        ayudante a = new ayudante(200, "abc", 10);
        System.out.println("Soy el ayudante de id " + a.getId() + " y estudio en la universidad " + a.getId_u() );
    }
}
