JFLAGS = -g
JC = javac
JVM= java
JavaFX = --module-path /home/polivares/Downloads/javafx-sdk-17.0.6/lib --add-modules javafx.controls
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JavaFX) $*.java
CLASSES = \
	BindingDemo.java \
	BindingAddDemo.java \
	ControlCircle.java \
	ControlCircleWithMouseAndKey.java \
	MouseEventDemo.java

default: classes

classes: $(CLASSES:.java=.class)

BindingDemo: BindingDemo.class
	$(JVM) $(JavaFX) BindingDemo

BindingAddDemo: BindingAddDemo.class
	$(JVM) $(JavaFX) BindingAddDemo

ControlCircle: ControlCircle.class
	$(JVM) $(JavaFX) ControlCircle

ControlCircleWithMouseAndKey: ControlCircleWithMouseAndKey.class
	$(JVM) $(JavaFX) ControlCircleWithMouseAndKey

MouseEventDemo: MouseEventDemo.class
	$(JVM) $(JavaFX) MouseEventDemo

clean:
	$(RM) *.class
