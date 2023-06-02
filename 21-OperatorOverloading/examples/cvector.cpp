// vectors: overloading operators example
#include<iostream>

class CVector {  // Definición de la clase 
  public:
    int x,y;
    CVector () {};  // debemos incluirlo si implementamos otro contructor
    CVector (int,int);
    CVector operator + (CVector);
};

CVector::CVector (int a, int b) {  // implementación de constructor
  x = a;
  y = b;
}

CVector CVector::operator+ (CVector param) {  // implementación de sobrecarga de operador +
  CVector temp;
  temp.x = x + param.x;
  temp.y = y + param.y;
  return (temp);
}

int main () {
  CVector a (3,1);
  CVector b (1,2);
  CVector c;
  c = a + b;
  std::cout << c.x << "," << c.y;
  return 0;
}