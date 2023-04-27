#include "CVector.h"

CVector::CVector (int a, int b) {
  x = a;
  y = b;
}

CVector CVector::operator+ (const CVector &param) const {
  CVector temp;
  temp.x = x + param.x;
  temp.y = y + param.y;
  return temp;
}
