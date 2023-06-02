// GasMotor.h: interface for the CGasMotor class.
//
//////////////////////////////////////////////////////////////////////

#if !defined(AFX_GASMOTOR_H__8C6F345A_CD29_446C_BD2C_46ED56EA2682__INCLUDED_)
#define AFX_GASMOTOR_H__8C6F345A_CD29_446C_BD2C_46ED56EA2682__INCLUDED_

#include "motor.h"

class CGasMotor  :public CMotor {
public:
  CGasMotor() 
  { m_nCylinders = 0; }

  CGasMotor(const string & id, int cylinders);

  void Display() const;
  void Input();

private:
  int m_nCylinders;
};

#endif // !defined(AFX_GASMOTOR_H__8C6F345A_CD29_446C_BD2C_46ED56EA2682__INCLUDED_)
