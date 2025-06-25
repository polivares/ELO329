#include "Movimiento.h"
#include "Pokemon.h"

//Constructor vacio
Movimiento::Movimiento() {}

//Destructor
Movimiento::~Movimiento() {}

//Constructor con parámetros
Movimiento::Movimiento(std::string nombreMovimiento, Tipo tipoMovimiento)
    : nombreMovimiento(nombreMovimiento), tipoMovimiento(tipoMovimiento) {}

//Método para imprimir el movimiento
void Movimiento::imprimir() const {
    std::cout << "Nombre movimiento: " << nombreMovimiento << std::endl;
}

//Implementación de clase Ataque con llamado a constructor de la clase padre
Ataque::Ataque(std::string nombreMovimiento, Tipo tipoMovimiento) : Movimiento(nombreMovimiento, tipoMovimiento) {}

//Implementación del método virtual puro
void Ataque::aplicar(Pokemon& poke) {
    poke.setActualHP(poke.getActualHP() - 5);
}

//Implementación de clase Curacion con llamado a constructor de la clase padre
Curacion::Curacion(std::string nombreMovimiento, Tipo tipoMovimiento) : Movimiento(nombreMovimiento, tipoMovimiento) {}

//Implementación del método virtual puro
void Curacion::aplicar(Pokemon& poke) {
    poke.setActualHP(poke.getActualHP() + 5);
}

//Implementación de clase Ventaja con llamado a constructor de la clase padre
Ventaja::Ventaja(std::string nombreMovimiento, Tipo tipoMovimiento) : Movimiento(nombreMovimiento, tipoMovimiento) {}

//Implementación del método virtual puro
void Ventaja::aplicar(Pokemon& poke) {
    poke.setAttack(poke.getAttack() + 5);
}

//Implementación de clase Desventaja con llamado a constructor de la clase padre
Desventaja::Desventaja(std::string nombreMovimiento, Tipo tipoMovimiento) : Movimiento(nombreMovimiento, tipoMovimiento) {}

//Implementación del método virtual puro
void Desventaja::aplicar(Pokemon& poke) {
    poke.setDefense(poke.getDefense() - 5);
}

//Función amiga
void calcularEfecto(Movimiento& move, Pokemon& poke) {
    move.aplicar(poke);
}

