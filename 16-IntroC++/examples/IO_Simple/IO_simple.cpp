#include <iostream>
#include <fstream>
 
int main(){
 int i; // Esta variable guarda los número del archivo
 std::ifstream fin;
 fin.open("test.txt"); // test.txt contains 3 ints
 for (int j=0;j<3;j++){
    fin  >> i;
    std::cout << i  << std::endl;
 }
 fin.close();
 return 0;
}
