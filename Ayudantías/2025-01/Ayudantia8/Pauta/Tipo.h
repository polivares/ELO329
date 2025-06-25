//
// Created by ignac on 30-05-2025.
//


#ifndef TIPO_H
#define TIPO_H
#include<string>
#include<vector>
#include<iostream>

//Como un tipo puede tener multiples fortalezas o debilidad, se utilizará la biblioteca vector
//https://www.w3schools.com/cpp/cpp_vectors.asp
class Tipo{
    private:
		//Atributos
		std::string typeName; //Nombre del tipo
		std::vector<std::string> strengths; //Vector de fortalezas
		std::vector<std::string> weaknesses; //Vector de debilidades
		std::vector<std::string> immunity; //Vector de inmunidades

	public:
		//Constructores y destructores
		Tipo();
		Tipo(std::string typeName, std::vector<std::string> strengths, std::vector<std::string> weaknesses, std::vector<std::string> immunity);
		~Tipo();

		//Getters
		std::string getTypeName() const;
		std::vector<std::string> getStrengths() const;
		std::vector<std::string> getWeaknesses() const;
		std::vector<std::string> getImmunity() const;

		//Setters
		void setTypeName(std::string typeName);
		void setStrengths(std::vector<std::string> strengths);
		void setWeaknesses(std::vector<std::string> weaknesses);
		void setImmunity(std::vector<std::string> immunity);

		//Métodos
		void imprimir() const;

};





#endif //TIPO_H
