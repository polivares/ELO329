// motor.h - Motor class definition

#ifndef __CMOTOR_H
#define __CMOTOR_H

#include <string>
#include <iostream>
using namespace std;

class CMotor {
public:
  CMotor() { }
  CMotor( const string & id );

  string get_ID() const;
	void set_ID(const string & s);

	// Definir un método como virtual equivale a decir que ese método en particular
	// se comporta como checklist ante ligado dinámico
	virtual void Display() const;
	// Display a motor on the console.

	virtual void Input();
	// Input a motor from the user.

  bool operator <( const CMotor & M2 )
  { return m_sID < M2.m_sID; }

private:
	string m_sID;       // the motor identification number
};

#endif

