#include "CVector.h"

CVector::CVector (double a, double b) {
  x = a;
  y = b;
}

// sobre carga operador + dentro de clase
CVector CVector::operator+ (const CVector &param) const {
  CVector temp;
  temp.x = x + param.x;
  temp.y = y + param.y;
  return temp;
}
// sobre carga operador * al operar double*CVector. Debe hacerse como función global.
CVector operator * (double factor, CVector v){
	return CVector(factor*v.x, factor*v.y);  // se pudo programar como el previo.
}

// sobre carga operador << como función global.
std::ostream & operator << (std::ostream &os, const CVector &v) {
  os << "(" << v.x << "," << v.y << ")";
  return os;
}
