// PumpMotor.h: interface for the CPumpMotor class.
//
//////////////////////////////////////////////////////////////////////

#if !defined(AFX_PUMPMOTOR_H__EB4FA50A_22A8_42B7_8567_49C7DE4DEA75__INCLUDED_)
#define AFX_PUMPMOTOR_H__EB4FA50A_22A8_42B7_8567_49C7DE4DEA75__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

#include "ElectricMotor.h"

class CPumpMotor : public CElectricMotor  
{
public:
	void Display() const
  {
    // CMotor::Display is not accessible because 
    // CElectricMotor uses 'private' to inhereit 
    // from 'CMotor'
    //    CElectricMotor::Display();            // error
    CMotor::Display();            // error

  }


};

#endif // !defined(AFX_PUMPMOTOR_H__EB4FA50A_22A8_42B7_8567_49C7DE4DEA75__INCLUDED_)
