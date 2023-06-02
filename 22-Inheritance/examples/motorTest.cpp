// Lecture6_8.cpp - Inheritance

/*************************************************
Program Title: 

Created By: 

Date Created: 

Last Update: 

*************************************************/

#include <iostream>
#include <string>
#include <fstream>
#include <vector>
#include <cstdlib>
using namespace std;

#include "ElectricMotor.h"


void Example1()
// Create and display two motors. Input a third.
{
  CMotor mot("33333");
  mot.Display();
  cout << endl;

  CElectricMotor elec("40000",220.0);
  elec.Display();
  cout << endl;

  // input an electric motor
  CElectricMotor temp;
  temp.Input();
}

void Example2()
// Dynamic memory, using pointers
{
	CElectricMotor * pC = new CElectricMotor;

	pC->set_ID("33333");   
	pC->set_Voltage(110.5);
	pC->Display();
	
	delete pC;  // delete before going out of scope
}

void Example3()
// Dynamic binding refers to the pointer, which
// can point to different types of motors.
// However, calls base class members
{
	CMotor * pC = new CElectricMotor;

  pC->Input();
  pC->Display();
}



void main()
{
	//Example1();
  //Example2();
	Example3();




}
