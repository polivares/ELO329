/**
   @version 1.10 1999-12-18
   @author Cay Horstmann
*/


public class EmployeeTest  {  
   public static void main(String[] args)  {  
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

      // raise everyone's salary by 5%
      for (int i = 0; i < staff.length; i++)
         staff[i].raiseSalary(5);

      // print out information about all Employee objects
      for (int i = 0; i < staff.length; i++)
      {  
         Employee e = staff[i];
         System.out.println("name=" + e.getName()
            + ",salary=" + e.getSalary()
            + ",hireDay=" + e.getHireDay());
      }
   }
}

