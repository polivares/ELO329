#include "tempconverter.h"

TempConverter::TempConverter(int tempCelsius, QObject *parent):QObject(parent)
{
    m_tempCelsius = tempCelsius;
}

int TempConverter::tempCelsius(){
    return m_tempCelsius;
}

int TempConverter::tempFahrenheit(){
    return ((9.0/5.0)*m_tempCelsius + 32);
}

void TempConverter::setTempCelsius(int tempCelsius){
    if(m_tempCelsius != tempCelsius){
        m_tempCelsius = tempCelsius;
        emit tempFahrenheitChanged(tempFahrenheit());
    }
}

void TempConverter::setTempFahrenheit(int tempFahrenheit){
    int tempCelsius = (5.0/9.0)*(tempFahrenheit -32);
    if(m_tempCelsius != tempCelsius){
        setTempCelsius(tempCelsius);
        emit tempCelsiusChanged(tempCelsius);
    }
}

