#include"Automobile.h"
#include<iostream>

int main(){
    // Acá creamos un objeto de tipo Automobile
    Automobile myCar;

    // Con notación "." accedemos a los métodos o 
    // atributos públicos
    myCar.set_NumDoors(4);
    std::cout << "Enter all data for an automobile: ";
    myCar.input();
    std::cout << "This is what you entered: ";
    myCar.display();
    std::cout << "This car has " << myCar.get_NumDoors()
    << " doors.\n";

    return 0;
}