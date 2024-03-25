/**
   @version 1.00 1999-12-17
   @author Cay Horstmann
*/

import java.text.*;

public class PersonTest
{  
   public static void main(String[] args)
   {  
      Person[] people = new Person[2];

      // fill the people array with Student and Employee objects
      people[0] 
         = new Employee("Harry Hacker", 50000);
      people[1] 
         = new Student("Maria Morris", "computer science");

      // print out names and descriptions of all Person objects
      for (int i = 0; i < people.length; i++)
      {
          /*
         Person p = people[i];
         System.out.println(p.getName() + ", "
            + p.getDescription());
          */
         System.out.println(people[i].getName() + ", "
            + people[i].getDescription());
      }
   }
}

abstract class Person
{  
   public Person(String n)
   {  
      name = n;
   }

   public abstract String getDescription();

   public final String getName()
   {  
      return name;
   }

   private String name;
}

class Employee extends Person
{  
   public Employee(String n, double s)
   {  
      // pass name to superclass constructor
      super(n);
      salary = s;
   }


   public double getSalary()
   {  
      return salary;
   }

   public String getDescription()
   {  
      NumberFormat formatter
         = NumberFormat.getCurrencyInstance();
      return "an employee with a salary of "
         + formatter.format(salary);
   }

   public void raiseSalary(double byPercent)
   {  
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   private double salary;
}

class Student extends Person
{  
   /**
      @param n the student's name
      @param m the student's major
   */
   public Student(String n, String m)
   {  
      // pass n to superclass constructor
      super(n);
      major = m;
   }

   public String getDescription()
   {  
      return "a student majoring in " + major;
   }

   private String major;
}


