#include"Point.h"
#include<iostream>

Point::Point(){
    // Acá va mi código del constructor
    m_X = 0;
    m_Y = 0;
}

void Point::draw(){
    std::cout << "Dibujando mi punto" << std::endl;
}