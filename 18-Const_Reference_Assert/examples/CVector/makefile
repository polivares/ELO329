main:	main.o CVector.o
	g++ -o main main.o CVector.o

main.o:	main.cpp CVector.h 
	g++ -c main.cpp

CVector.o: CVector.cpp CVector.h
	g++ -c CVector.cpp

run:	main
	./main

clean: 
	rm -rf *.o main

