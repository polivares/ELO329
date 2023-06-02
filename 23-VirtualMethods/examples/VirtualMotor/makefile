CC 	= g++
INCLUDE = -I. 

Objetivos = motorTest
Dependencias = ElectricMotor.o GasMotor.o motor.o motorTest.o

all: $(Objetivos)

motorTest: $(Dependencias)
	$(CC) -o $@ $^

# $@ es el nombre del objetivo (etiqueta) de la regla
# $< es el nombre del primer pre-requisito 
# $? es el nombre de todos los pre-requisitos que son mas nuevos que el nombre de la regla
# $^ es el nombre de todos los pre-requisitos

#(%.o) : %.cpp

clean:
	rm $(Dependencias) $(Objetivos)

