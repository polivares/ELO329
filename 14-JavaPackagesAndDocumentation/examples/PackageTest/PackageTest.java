/**
   @version 1.10 1999-12-18
   @author Cay Horstmann
*/

import com.horstmann.corejava.*;
   // the Employee class is defined in that package

public class PackageTest
{  
   public static void main(String[] args)
   {  
      // because of the import statement, we don't have to
      // use com.horstmann.corejava.Employee here
      Employee harry = new Employee("Harry Hacker", 50000,
         1989, 10, 1);

      // raise salary by 5%
      harry.raiseSalary(5);

      // print out information about harry
      System.out.println("name=" + harry.getName()
         + ",salary=" + harry.getSalary());
   }
}

