#include <iostream>
#include "CVector.h"
using namespace std;

int main () {
  CVector a (3,5);
  CVector b (1,2);
  CVector c;
  c = a + b;
  cout << c.x << "," << c.y << endl;
  return 0;
}
