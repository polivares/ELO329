#include<iostream>

class A{
    public:
        int x, y;
};

// La función f está creando un objeto que puede ser utilizado
// fuera de dicha
A* f(){
    // Esta línea crea el objeto en el heap con el operador
    // new (recuerden que no se libera hasta hacer un delete)
    A *pa = new A;// inicializa el objeto en x=0 e y=0
    return pa;
  
}

int main(){
    // La dirección de memoria se retorna desde la función
    // f() y se asigna a una nueva variable llamada puntero_a.
    // Ojo, el objeto creado en f() sigue existiendo
    A *puntero_a = f();
    // Acá podemos acceder al objeto creado en f() normalmente
    // porque su dirección de memoria se encuentra almacenada 
    // en la variable puntero_a
    std::cout << puntero_a->x << puntero_a->y << std::endl;
    // Siempre recordar que el objeto debe ser liberado en algún
    // momento
    delete puntero_a;
    return 0;
}