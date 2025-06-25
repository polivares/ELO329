#ifndef MOVIMIENTO_H
#define MOVIMIENTO_H

#include "Tipo.h"
#include <string>
#include <iostream>

class Pokemon; // Declaración adelantada

class Movimiento {
protected:
    //Atributos
    std::string nombreMovimiento;
    Tipo tipoMovimiento;

public:
    //Constructores
    Movimiento();
    Movimiento(std::string nombreMovimiento, Tipo tipoMovimiento);

    //Destructor
    virtual ~Movimiento();

    void imprimir() const;
    virtual void aplicar(Pokemon& pokemon) = 0; //Método virtual puro
    friend void calcularEfecto(Movimiento& move, Pokemon& poke); //Método amigo
};

//Clase hija que hereda de Movimiento
class Ataque : public Movimiento {
public:
    //Constructor
    Ataque(std::string nombreMovimiento, Tipo tipoMovimiento);
    void aplicar(Pokemon& pokemon) override;
};

//Clase hija que hereda de Movimiento
class Ventaja : public Movimiento {
public:
    //Constructor
    Ventaja(std::string nombreMovimiento, Tipo tipoMovimiento);
    void aplicar(Pokemon& pokemon) override;
};

//Clase hija que hereda de Movimiento
class Desventaja : public Movimiento {
public:
    //Constructor
    Desventaja(std::string nombreMovimiento, Tipo tipoMovimiento);
    void aplicar(Pokemon& pokemon) override;
};

//Clase hija que hereda de Movimiento
class Curacion : public Movimiento {
public:
    //Constructor
    Curacion(std::string nombreMovimiento, Tipo tipoMovimiento);
    void aplicar(Pokemon& pokemon) override;
};

#endif // MOVIMIENTO_H
