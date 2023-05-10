// Private and protected Inheritance 

#include <iostream>
#include <string>
#include <fstream>
#include <vector>
#include <cstdlib>
using namespace std;

#include "ElectricMotor.h"

void Example1()
// Protected access example
{
  CElectricMotor EM;
  EM.set_ID("12345");  // error
}



void main()
{
	Example1();




}
