// motor.cpp - Motor class implementation file

#include "motor.h"

CMotor::CMotor( const string & id )
{ set_ID(id); }

string CMotor::get_ID() const
{ return m_sID; }

void CMotor::set_ID(const string & s)
{ m_sID = s; }

void CMotor::Display() const
{
	cout << "[CMotor] ID=" << m_sID;
}

void CMotor::Input()
{
	string temp;
	cout << "Enter Motor ID: ";
	cin >> temp;
	set_ID(temp);
}

