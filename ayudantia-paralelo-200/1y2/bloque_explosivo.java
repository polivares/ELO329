public class  bloque_explosivo{
    protected int id;
    private String nombre = "Dinamita"; 

    public void explotar()
    {
        System.out.println("OOOO VOY A EXPLOTAR");
    };
    public int getId(){return id;};

    bloque_explosivo(int _identificador)
    {
        id = _identificador;
        nombre = "Pepe";
    };

}