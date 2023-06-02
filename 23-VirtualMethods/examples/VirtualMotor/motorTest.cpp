// MotorTest.cpp - Virtual Functions

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cstdlib>
using namespace std;

#include "ElectricMotor.h"
#include "GasMotor.h"


void GetAndShowMotor( CMotor * pC )
// This works with any type of motor
{
  pC->Input();
  cout << "\nHere's what you entered:\n";
  pC->Display();
  cout << "\n\n";
}


void Example4()
// Introduce dynamic binding (polymorphism)
{
  CMotor * pM = new CMotor;
  GetAndShowMotor( pM );

  CElectricMotor * pE = new CElectricMotor;
  GetAndShowMotor( pE );

  CGasMotor * pG = new CGasMotor;
  GetAndShowMotor( pG );

  delete pM;
  delete pE;
  delete pG;
}

void ShowVector( const vector<CMotor*> & vMotors )
// Display a vector containing pointers to various
// types of motors.
{
  cout << "---- Vector of Motor Pointers ----\n";
  for(int i=0; i < vMotors.size(); i++)
  {
    cout << (i+1) << ": ";
    vMotors[i]->Display();   // virtual function
    cout << endl;
  }
}


void Example5()
// Create a vector of CMotor pointers
{
	vector<CMotor*> vMotors;
	CMotor * pMotor;

	// Create some motors and store their pointers
  // in the vector.

  pMotor = new CElectricMotor("10000",110);
  vMotors.push_back(pMotor);

  pMotor = new CGasMotor("20000",4);
  vMotors.push_back(pMotor);

  pMotor = new CElectricMotor("30000",220);
  vMotors.push_back(pMotor);

  pMotor = new CGasMotor("40000",2);
  vMotors.push_back(pMotor);

  // display the vector
  ShowVector( vMotors );

	// Important! deallocate the motors before
	// the vector goes out of scope.

	for(int i=0; i < vMotors.size(); i++)
	{
		delete vMotors[i];  // delete each motor
	}

}



int main()
{
	//Example4();
  Example5();

}
