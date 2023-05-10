#include<vector>
#include<iostream>

int main(){
    std::vector<int> x;
    // Inmediatamente podemos agregar los elementos 
    // pertenecientes al vector
    for(int i=0; i<10; i++)
        x.push_back(i);

    // A continuación recorreremos el vector de elementos
    for(int j=0; j<10; j++)
        std::cout << x[j] << std::endl;

    return 0;
}