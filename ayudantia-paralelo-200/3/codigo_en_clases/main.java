public class main {
    public static void main(String[] args) {
        bloque[] bloques = new bloque[2];
        bloques[0] = new bloque();
        bloques[1] = new bloque_interactivo(4);    

        bloques[0].interactuar();
        bloques[1].interactuar();
    }
}
