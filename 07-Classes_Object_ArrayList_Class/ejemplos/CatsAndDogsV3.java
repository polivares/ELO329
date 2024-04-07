//: c08:CatsAndDogs.java
// From Thinking in Java, 2nd Edition
// Available at http://www.BruceEckel.com
// (c) Bruce Eckel 1999
// Copyright notice in Copyright.txt
// Simple collection example
// Modified by
// 03/04/07 Agustin J. Gonzalez to accept parameterized ArrayList
import java.util.*;

abstract class Animal 
{
 abstract void print();
  
}

class Cat extends Animal {
  private int catNumber;
  Cat(int i) {
    catNumber = i;
  }
  void print() {
    System.out.println("Cat #" + catNumber);
  }
}

class Dog extends Animal{
  private int dogNumber;
  Dog(int i) {
    dogNumber = i;
  }
  void print() {
    System.out.println("Dog #" + dogNumber);
  }
}
class CatsAndDogsV3 {
  public static void main(String[] args) {
// old version    ArrayList animals = new ArrayList();
    ArrayList<Animal> animals = new ArrayList<Animal>();  // new version
    for(int i = 0; i < 7; i++)
      animals.add(new Cat(i));
    // Not a problem to add a dog to cats:
    animals.add(new Dog(7));
    for(int i = 0; i < animals.size(); i++)
// old version	    ((Animal)animals.get(i)).print();
      animals.get(i).print();  /* new version. It does not need
                                  casting because this ArrayList
                                  returns Animal as it was defined. */
    
  }
} 
