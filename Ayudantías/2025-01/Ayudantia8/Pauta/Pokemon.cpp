#include "Pokemon.h"
#include "Movimiento.h"
#include <cmath>
#include <iostream>

//Contructor vacio de Pokemon
Pokemon::Pokemon() : name(""), actualHP(1), maxHP(1), attack(20), defense(20), level(1), actualExp(0), exp2Lvl(10) {}

//Constructor con parámetros
Pokemon::Pokemon(std::string name, int maxHP, int attack, int defense, int level, std::vector<Tipo> tipoPokemon, std::vector<Movimiento*> movimientos)
    : name(name), actualHP(maxHP), maxHP(maxHP), attack(attack), defense(defense), level(level), actualExp(0), tipoPokemon(tipoPokemon), movimientos(movimientos) {
    exp2Lvl = calculateExp2Lvl();
}

//Destructor
Pokemon::~Pokemon() {}

//Getters
std::string Pokemon::getName() const { return name; }
int Pokemon::getActualHP() const { return actualHP; }
int Pokemon::getMaxHP() const { return maxHP; }
int Pokemon::getActualExp() const { return actualExp; }
int Pokemon::getExp2Lvl() const { return exp2Lvl; }
int Pokemon::getLevel() const { return level; }
int Pokemon::getAttack() const { return attack; }
int Pokemon::getDefense() const { return defense; }
std::vector<Tipo> Pokemon::getTipoPokemon() const { return tipoPokemon; }
std::vector<Movimiento*> Pokemon::getMovimientos() const { return movimientos; }

//Setters
void Pokemon::setActualHP(int actualHP) { this->actualHP = actualHP; }
void Pokemon::setMaxHP(int maxHP) { this->maxHP = maxHP; }
void Pokemon::setActualExp(int actualExp) { this->actualExp = actualExp; }
void Pokemon::setLevel(int level) { this->level = level; }
void Pokemon::setAttack(int attack) { this->attack = attack; }
void Pokemon::setDefense(int defense) { this->defense = defense; }
void Pokemon::setTipoPokemon(std::vector<Tipo> tipoPokemon) { this->tipoPokemon = tipoPokemon; }

//Paso por referencia
void Pokemon::setMovimientos(std::vector<Movimiento*> &nuevosMovimientos) {
    movimientos = nuevosMovimientos;
}

//Métodos

//Subir de nivel
void Pokemon::levelUp() {
    level++;
    maxHP = std::round(maxHP * 1.1);
    actualHP = maxHP;
    attack = std::round(attack * 1.1);
    defense = std::round(defense * 1.1);
}

//Calculo de experiencia para subir de nivel
int Pokemon::calculateExp2Lvl() {
    return level * level * 10;
}

//Subir experiencia
void Pokemon::aumentarExp(int expGanada) {
    int tempExp = actualExp + expGanada;
    while (tempExp > exp2Lvl) {
        levelUp();
        tempExp -= exp2Lvl;
        exp2Lvl = calculateExp2Lvl();
    }
    actualExp = tempExp;
}

//Imprimir pokemon
void Pokemon::imprimir() const {
    std::cout << ">> Nombre Pokemon: " << name << std::endl;
    std::cout << ">> Nivel: " << level << std::endl;
    std::cout << ">> HP Actual: " << actualHP << std::endl;
    std::cout << ">> HP Max: " << maxHP << std::endl;
    std::cout << ">> Experiencia: " << actualExp << std::endl;
    std::cout << ">> Experiencia para subir de nivel: " << exp2Lvl << std::endl;

    //Llamado a método de Tipo
    for (const Tipo &t : tipoPokemon) {
        t.imprimir();
    }

    //Llamado a método de Movimiento
    for (Movimiento *m : movimientos) {
        m->imprimir();
    }

std::cout <<"-------------------------------------------------------\n" <<std::endl;
}

