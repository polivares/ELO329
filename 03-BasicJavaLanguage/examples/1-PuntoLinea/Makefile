JFLAGS = -g
JC = javac
JVM= java  # Added by Agustin Gonzalez
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Punto.java Linea.java LineaTest.java

# main variable: Added by Agustin Gonzalez
MAIN = LineaTest

default: classes

classes: $(CLASSES:.java=.class)

# run tarjet added by Agustín González
run: 
	$(JVM) $(MAIN)

clean:
	$(RM) *.class
