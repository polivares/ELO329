# makefile sin uso de macros
friendTest: friendTest.o CVector.o
	g++ -o friendTest friendTest.o CVector.o

friendTest.o: friendTest.cpp CVector.h 
	g++ -c friendTest.cpp

CVector.o: CVector.cpp CVector.h
	g++ -c CVector.cpp

clean: 
	rm -rf *.o friendTest

