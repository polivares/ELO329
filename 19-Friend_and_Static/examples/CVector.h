// Recuerden que con # se definen las directivas de compilación
// Esta directiva definida abajo, se lee de la siguiente manera:
// Si CVector.h no fue incluída anteriormente... inclúyela
#ifndef CVECTOR_H
#define CVECTOR_H
#include <ostream>

class CVector {
  private:
    double x,y;
  public:
    CVector () {};
    CVector (double , double);
    CVector operator + (const CVector &) const;
    friend CVector operator * (double factor, CVector v);
    friend std::ostream & operator<< (std::ostream &, const CVector &);
};
#endif
