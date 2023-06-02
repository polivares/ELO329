// GasMotor.cpp: implementation of the CGasMotor class.
//
//////////////////////////////////////////////////////////////////////

#include "GasMotor.h"

//////////////////////////////////////////////////////////////////////
// Construction/Destruction
//////////////////////////////////////////////////////////////////////

CGasMotor::CGasMotor(const string & id, int cylinders)
              :CMotor(id)
{
  m_nCylinders = cylinders;
}

void CGasMotor::Display() const
{
  cout << "[GasMotor] ";
  CMotor::Display();
  cout << ", Cylinders=" << m_nCylinders;
}

void CGasMotor::Input()
{
  cout << "[GasMotor]: ";
  CMotor::Input();
  cout << "Enter the number of cylinders: ";
  cin >> m_nCylinders;
}
