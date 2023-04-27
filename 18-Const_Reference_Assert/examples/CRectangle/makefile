# Definiciones Macro para una aplicación "estándar".
#
# Definición de flags de compilación
FLAGS=-g -DDEBUG
#
# comandos para la compilación
.SUFFIXES: .cpp .c .h .o
.c.o: ; cc $(FLAGS) -c $*.c
.cc.o: ; gcc $(FLAGS) -c $*.cc
.cpp.o: ; g++ $(FLAGS) -c $*.cpp
#
# Tareas
all: CRectangleAll CRectangleTest

CRectangleAll: CRectangleAll.o
	g++ -o CRectangleAll CRectangleAll.o

CRectangleTest: CRectangleTest.o CRectangle.o
	g++ -o CRectangleTest CRectangleTest.o CRectangle.o

CRectangle.o: CRectangle.cpp CRectangle.h

CRectangleTest.o: CRectangleTest.cpp CRectangle.h

clean:
	rm *.o

