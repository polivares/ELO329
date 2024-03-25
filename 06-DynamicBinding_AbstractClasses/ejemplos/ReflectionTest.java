/**
   @version 1.01 2000-04-11
   @author Cay Horstmann
*/

import java.lang.reflect.*;
import javax.swing.*;

public class ReflectionTest
{  
   public static void main(String[] args)
   {  
      // read class name from command line args or user input
      String name;
      if (args.length > 0) 
         name = args[0];
      else 
         name = JOptionPane.showInputDialog
            ("Class name (e.g. java.util.Date): ");

      try
      {  
         // print class name and superclass name (if != Object)
         Class cl = Class.forName(name);
         Class supercl = cl.getSuperclass();
         System.out.print("class " + name);
         if (supercl != null && supercl != Object.class)
            System.out.print(" extends " + supercl.getName());

         System.out.print("\n{\n");
         printConstructors(cl);
         System.out.println();
         printMethods(cl);
         System.out.println();
         printFields(cl);
         System.out.println("}");
      }
      catch(ClassNotFoundException e) { e.printStackTrace(); }
      System.exit(0);
   }

   /**
      Prints all constructors of a class
      @param cl a class
    */
   public static void printConstructors(Class cl)
   {  
      Constructor[] constructors = cl.getDeclaredConstructors();

      for (int i = 0; i < constructors.length; i++)
      {  
         Constructor c = constructors[i];
         String name = c.getName();
         System.out.print("   " + Modifier.toString(c.getModifiers()));
         System.out.print(" " + name + "(");

         // print parameter types
         Class[] paramTypes = c.getParameterTypes();
         for (int j = 0; j < paramTypes.length; j++)
         {  
            if (j > 0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   /**
      Prints all methods of a class
      @param cl a class
    */
   public static void printMethods(Class cl)
   {  
      Method[] methods = cl.getDeclaredMethods();

      for (int i = 0; i < methods.length; i++)
      {  
         Method m = methods[i];
         Class retType = m.getReturnType();
         String name = m.getName();

         // print modifiers, return type and method name
         System.out.print("   " + Modifier.toString(m.getModifiers()));
         System.out.print(" " + retType.getName() + " " + name
            + "(");

         // print parameter types
         Class[] paramTypes = m.getParameterTypes();
         for (int j = 0; j < paramTypes.length; j++)
         {  
            if (j > 0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   /**
      Prints all fields of a class
      @param cl a class
    */
   public static void printFields(Class cl)
   {  
      Field[] fields = cl.getDeclaredFields();

      for (int i = 0; i < fields.length; i++)
      {  
         Field f = fields[i];
         Class type = f.getType();
         String name = f.getName();
         System.out.print("   " + Modifier.toString(f.getModifiers()));
         System.out.println(" " + type.getName() + " " + name
            + ";");
      }
   }
}
