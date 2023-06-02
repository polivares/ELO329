//Pondré todo en un solo archivo por simplicidad
#include <iostream>
using namespace std;

class Animal 
{
public:
  virtual void print()=0;
    /*{
//  virtual void print() {
    cout << "no puedo hacer nada en Animal"<<endl;
    }*/
};

class Cat: public Animal {
public:
  Cat(int i);  // o Cat(int);
  virtual void print();
private:
  int catNumber;
};

class Dog: public Animal{
public:
  Dog(int i);
  virtual void print();
private:
  int dogNumber;
};
