JFLAGS = -g
JC = javac
JVM= java
JavaFX = --module-path /Users/agustin/tools/javafx-sdk-17.0.2/lib --add-modules javafx.controls,javafx.media
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JavaFX) $*.java
CLASSES = AudioMediaDemo.java

default: classes

classes: $(CLASSES:.java=.class)

run: AudioMediaDemo.class
	$(JVM) $(JavaFX) AudioMediaDemo

clean:
	$(RM) *.class
