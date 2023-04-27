#ifndef CVECTOR_H
#define CVECTOR_H
class CVector {
  public:
    int x,y;
    CVector () {};
    CVector (int,int);
    CVector operator + (const CVector &) const;
};
#endif
