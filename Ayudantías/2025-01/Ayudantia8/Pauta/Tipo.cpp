//
// Created by ignac on 30-05-2025.
//

#include "Tipo.h"

// Constructor por defecto
Tipo::Tipo() {
    typeName = "";
    strengths = {};
    weaknesses = {};
    immunity = {};
}

// Constructor con parámetros
Tipo::Tipo(std::string typeName, std::vector<std::string> strengths, std::vector<std::string> weaknesses, std::vector<std::string> immunity) {
    this->typeName = typeName;
    this->strengths = strengths;
    this->weaknesses = weaknesses;
    this->immunity = immunity;
}

// Destructor
Tipo::~Tipo() {
    // No se requiere liberar memoria manualmente
}

// Getters
std::string Tipo::getTypeName() const{
    return typeName;
}

std::vector<std::string> Tipo::getStrengths() const{
    return strengths;
}

std::vector<std::string> Tipo::getWeaknesses() const{
    return weaknesses;
}

std::vector<std::string> Tipo::getImmunity() const{
    return immunity;
}

// Setters
void Tipo::setTypeName(std::string typeName) {
    this->typeName = typeName;
}

void Tipo::setStrengths(std::vector<std::string> strenghts) {
    this->strengths = strengths;
}

void Tipo::setWeaknesses(std::vector<std::string> weaknesses) {
    this->weaknesses = weaknesses;
}

void Tipo::setImmunity(std::vector<std::string> immunity) {
    this->immunity = immunity;
}

// Método imprimir
void Tipo::imprimir() const{
    std::cout << "Tipo: " << typeName << std::endl;

    std::cout << "Fortalezas: ";
    for (const std::string& s : strengths) {
        std::cout << ">> " << s << " ";
    }
    std::cout << std::endl;

    std::cout << "Debilidades: ";
    for (const std::string& w : weaknesses) {
        std::cout << ">> " << w << " ";
    }
    std::cout << std::endl;

    std::cout << "Inmunidades: ";
    for (const std::string& i : immunity) {
        std::cout << ">> " << i << " ";
    }
    std::cout << std::endl;
}

