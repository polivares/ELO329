CC 	= g++
INCLUDE = -I. 

Objetivos = CatsAndDogs

all: $(Objetivos)

CatsAndDogs: CatsAndDogs.o
	$(CC) -o $@ $^

# $@ es el nombre del objetivo (etiqueta) de la regla
# $< es el nombre del primer pre-requisito 
# $? es el nombre de todos los pre-requisitos que son mas nuevos que el nombre de la regla
# $^ es el nombre de todos los pre-requisitos

(%.o) : %.cpp  %.h

clean:
	rm *.o $(Objetivos)
