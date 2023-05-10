// motor.h - Motor class definition

#include <string>
#include <iostream>
using namespace std;

class CMotor {
public:
  CMotor() { }
  CMotor( const string & id );

  string get_ID() const;
	void set_ID(const string & s);

	void Display() const;
	// Display a motor on the console.

	void Input();
	// Input a motor from the user.

private:
	string m_sID;       // the motor identification number
};

