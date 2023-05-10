#include <iostream>
#include "CVector.h"

int main () {
  CVector a (3,5);
  CVector b (1,2);
  CVector c;
  c = a + b;
  std::cout << "c = " << c << std::endl;
  c = 5.0*c;
  std::cout << "5.0*c = " << c << std::endl;
  return 0;
}
