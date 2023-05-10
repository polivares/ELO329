#include"Automobile.h"
#include<iostream>

Automobile::Automobile(){
    numDoors=0;
    numCylinders=0;
    engineSize=0;
}

Automobile::Automobile(std::string p_make, int doors,
int cylinders, int engineSize){
    make = p_make;
    numDoors = doors;
    numCylinders = cylinders;
    this->engineSize = engineSize;
}

Automobile::Automobile(const Automobile &a){
    // Acá va el código de copia...
}

void Automobile::display() const{
    std::cout << "Make: " << make
    << ", Doors: " << numDoors
    << ", Cyl: " << numCylinders
    << ", Engine: " << engineSize
    << std::endl;
}

void Automobile::input() {
    std::cout << "Enter the make: ";
    std::cin >> make;
    std::cout << "How many doors? ";
    std::cin >> numDoors;
    std::cout << "How many cylinders? ";
    std::cin >> numCylinders;
    std::cout << "What size engine? ";
    std::cin >> engineSize;
}

int Automobile::get_NumDoors() const{
    return numDoors;
}

void Automobile::set_NumDoors(int doors){
    numDoors = doors;
}

Automobile::~Automobile(){
    
}