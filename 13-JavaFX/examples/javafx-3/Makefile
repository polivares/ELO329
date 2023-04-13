JFLAGS = -g
JC = javac
JVM= java
JavaFX = --module-path /home/polivares/Downloads/javafx-sdk-17.0.6/lib --add-modules javafx.controls,javafx.media
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JavaFX) $*.java
CLASSES = \
	PathTransitionDemo.java \
	TimelineDemo.java \
	MenuBarDemo.java

default: classes

classes: $(CLASSES:.java=.class)

PathTransitionDemo: PathTransitionDemo.class
	$(JVM) $(JavaFX) PathTransitionDemo

TimelineDemo: TimelineDemo.class
	$(JVM) $(JavaFX) TimelineDemo

MenuBarDemo: MenuBarDemo.class
	$(JVM) $(JavaFX) MenuBarDemo

clean:
	$(RM) *.class 

