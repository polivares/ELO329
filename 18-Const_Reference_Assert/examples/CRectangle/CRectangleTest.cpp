// overloading class constructors
#include <iostream>
#include "CRectangle.h"
using namespace std;

int main () {
  CRectangle rect (3,4);
  CRectangle rectb;
  cout << "rect area: " << rect.area() << endl;
  cout << "rectb area: " << rectb.area() << endl;
  return 0;
}
