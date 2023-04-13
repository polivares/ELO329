JFLAGS = -g
JC = javac
JVM= java
JavaFX = --module-path /Users/agustin/tools/javafx-sdk-17.0.2/lib --add-modules javafx.controls,javafx.media
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JavaFX) $*.java
CLASSES = VideoMediaDemo.java

default: classes

classes: $(CLASSES:.java=.class)

run: VideoMediaDemo.class
	$(JVM) $(JavaFX) VideoMediaDemo

clean:
	$(RM) *.class
