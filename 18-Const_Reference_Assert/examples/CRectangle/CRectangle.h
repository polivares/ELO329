// overloading class constructors
#ifndef CRECTANGLE_H
#define CRECTANGLE_H

class CRectangle {
    int width, height;
  public:
    CRectangle ();
    CRectangle (int,int);
    int area (void) {return (width*height);}
};
#endif
