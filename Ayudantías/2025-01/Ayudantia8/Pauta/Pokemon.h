#ifndef POKEMON_H
#define POKEMON_H

#include "Tipo.h"
#include <string>
#include <vector>

class Movimiento; // Declaración adelantada

/*
La declaración adelantada viene a resolver las dependencias circulares,
esto implica que se deberá trabajar con las referencias (punteros)
*/

class Pokemon {
private:

    //Atributos
    std::string name;
    int actualHP;
    int maxHP;
    int attack;
    int defense;
    int level;
    int actualExp;
    int exp2Lvl;
    std::vector<Tipo> tipoPokemon;
    std::vector<Movimiento*> movimientos;

public:
    //Contructores
    Pokemon();
    Pokemon(std::string name, int maxHP, int attack, int defense, int level, std::vector<Tipo> tipoPokemon, std::vector<Movimiento*> movimientos);

    //Destructor
    ~Pokemon();

    //Getters
    std::string getName() const;
    int getActualHP() const;
    int getMaxHP() const;
    int getActualExp() const;
    int getExp2Lvl() const;
    int getLevel() const;
    int getAttack() const;
    int getDefense() const;
    std::vector<Tipo> getTipoPokemon() const;
    std::vector<Movimiento*> getMovimientos() const;

    //Setters
    void setActualHP(int actualHP);
    void setMaxHP(int maxHP);
    void setActualExp(int actualExp);
    void setLevel(int level);
    void setAttack(int attack);
    void setDefense(int defense);
    void setTipoPokemon(std::vector<Tipo> tipoPokemon);
    void setMovimientos(std::vector<Movimiento*> &movimientos);

    //Método
    void levelUp(); //Método para subir de nivel
    int calculateExp2Lvl(); //Método para calcular la experiencia necesaria para subir de nivel
    void aumentarExp(int expGanada);
    void imprimir() const; //Método para imprimir por pantalla.

    friend void calcularEfecto(Movimiento &move, Pokemon &poke);
};

#endif // POKEMON_H

