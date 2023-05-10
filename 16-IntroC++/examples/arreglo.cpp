#include<iostream>

int main(){
    int x[10];
    for(int i=0; i<10; i++)
        x[i] = i;
    
    // Recorriendo el arreglo recién creado
    for(int j=0; j<10; j++)
        std::cout << x[j] << std::endl;

    return 0;
}