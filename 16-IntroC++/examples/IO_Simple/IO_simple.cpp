#include <iostream>
#include <fstream>
 
 // Este programa leerá un archivo número a número y
 // cada número se mostrará por la terminal
int main(){
 int i; // Esta variable guarda los número del archivo
 std::ifstream fin; // Variable encargada de manejar el flujo de datos
 // desde el archivo
 fin.open("test.txt"); // test.txt contains 3 ints
 for (int j=0;j<3;j++){
    fin >> i;
    std::cout << i  << std::endl;
 }
 fin.close();
 return 0;
}
