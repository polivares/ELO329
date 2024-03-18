import java.util.*;

class Employee
{  /* los métodos con igual nombre que la clase
      son los contructores. Son usados para crear objetos (instancias
      de la clase). Son apropiados para definir el estado inicial 
      del objeto.
      Constructores no retornan valores.
      Constructores son llamados con new.
      Constructores pueden ser llamados desde otros constructores 
      usando la palabra reserva this.
   */
    public Employee(String n, double s, 
		    int year, int month, int day)
    {  
	name = n;
	salary = s;
	GregorianCalendar calendar
	    = new GregorianCalendar(year, month - 1, day);
	// GregorianCalendar uses 0 for January
	hireDay = calendar.getTime();
    }

    // método accesor
    // esta función sólo da acceso a un atributo
    // read-only
    public String getName()
    {  
	return name;
    }

    public double getSalary()
    {  
	return salary;
    }
    /* OJO se retorna una referencia a un valor privado.
       Externamente se podría modificar el datos.
       La solución es clonar el objeto y retornar el clono.
    */
    public Date getHireDay()
    {  
	return hireDay;
	// mejor return (Date) hireDay.clone();
		
    }
    // método mutador
    public void raiseSalary(double byPercent)
    {  
	double raise = salary * byPercent / 100;
	salary += raise;
    }
    // Miembros dato: Atributos para almacenar el estado.
    // aquí son privados => sólo visibles dentro de las funciones
    // de la clase.
    private final String name;
    private double salary;
    private Date hireDay;
}
