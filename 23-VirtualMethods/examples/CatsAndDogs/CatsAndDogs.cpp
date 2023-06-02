#include "CatsAndDogs.h"
#include <vector>
#include <iostream>
using namespace std;

// ídem, las implementaciones se han puesto juntas.

Cat::Cat(int i) {
  catNumber = i;
}

void Cat::print() {
  cout << "Cat #" << catNumber << endl;
}

Dog::Dog(int i) {
  dogNumber = i;
}

void Dog::print() {
  cout << "Dog #" << dogNumber << endl;
}

void usingPointer(Animal *a) {
  cout << "in unsingPointer" << endl;
  a->print();
}
void usingReference(Animal &a) {
  cout << "in unsingReference" << endl;
  a.print();
}

int main (void) {
  vector<Animal *> animals;
    // Animal a;
  
  for(int i = 0; i < 7; i++)
     animals.push_back(new Cat(i));
    // Not a problem to add a dog too
  animals.push_back(new Dog(7));
  for(int i = 0; i < animals.size(); i++) 
    animals[i]->print();
  cout << "---------"<<endl;
  Cat c(7);
  Dog d(8);
  Cat *c2=new Cat(329);
  usingPointer(&c);
  usingPointer(&d);
  usingPointer(c2);
  usingReference(c);
  usingReference(d);
  usingReference(*c2);
}
