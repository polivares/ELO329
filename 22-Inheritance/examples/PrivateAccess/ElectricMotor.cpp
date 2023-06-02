// ElectricMotor.cpp: implementation of the CElectricMotor class.
//
//////////////////////////////////////////////////////////////////////

#include "ElectricMotor.h"

//////////////////////////////////////////////////////////////////////
// Construction/Destruction
//////////////////////////////////////////////////////////////////////

CElectricMotor::CElectricMotor()
{
  m_nVoltage = 0;
}

CElectricMotor::CElectricMotor(const string & id, 
                double volts) : CMotor(id)
{
  m_nVoltage = volts;
}

void CElectricMotor::Input()
{
  CMotor::Input();  // call base class first

	double volts;
	cout << "Voltage: ";
	cin >> volts;
	set_Voltage(volts);
}

void CElectricMotor::Display() const
{
	// call base class function first
	CMotor::Display();

	cout << "  [CElectricMotor]"
       << " Voltage=" << m_nVoltage << endl;
}

void CElectricMotor::set_Voltage(double volts)
{ m_nVoltage = volts; }

double CElectricMotor::get_Voltage() const
{ return m_nVoltage; }
