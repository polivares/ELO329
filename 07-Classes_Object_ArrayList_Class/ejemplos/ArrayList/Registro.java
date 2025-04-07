import java.util.ArrayList;

public class Registro {
    public static void main(String[] args) {
        ArrayList<Estudiante> arr = new ArrayList<Estudiante>();
        arr.add(new Estudiante("Ana", 123));
        arr.add(new Estudiante("Luis", 456));

        for(int i=0; i< arr.size(); i++)
            System.out.println(arr.get(i).toString());
    }
}
