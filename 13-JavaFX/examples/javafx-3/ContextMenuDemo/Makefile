JFLAGS = -g
JC = javac
JVM= java
JavaFX = --module-path /Users/agustin/tools/javafx-sdk-17.0.2/lib --add-modules javafx.controls,javafx.media
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JavaFX) $*.java
CLASSES = ContextMenuDemo.java

default: classes

classes: $(CLASSES:.java=.class)

run: ContextMenuDemo.class
	$(JVM) $(JavaFX) ContextMenuDemo

clean:
	$(RM) *.class
