// ElectricMotor.h: interface for the CElectricMotor class.
//
//////////////////////////////////////////////////////////////////////

#if !defined(AFX_ELECTRICMOTOR_H__32D87D82_3D43_11D4_942F_00C04F78410F__INCLUDED_)
#define AFX_ELECTRICMOTOR_H__32D87D82_3D43_11D4_942F_00C04F78410F__INCLUDED_

#include "motor.h"

class CElectricMotor : public CMotor  {
public:
  CElectricMotor();
  CElectricMotor(const string & id, double volts);

  void Display() const;
  void Input();
	
  void set_Voltage(double volts);
  double get_Voltage() const;

private:
	double m_nVoltage;
};

#endif // !defined(AFX_ELECTRICMOTOR_H__32D87D82_3D43_11D4_942F_00C04F78410F__INCLUDED_)
