JFLAGS = -g
JC = javac
JVM= java
JavaFX = --module-path /home/polivares/Downloads/javafx-sdk-17.0.6/lib --add-modules javafx.controls
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(JavaFX) $*.java
CLASSES = \
	MyFirstJavaFX.java \
	MultipleStageDemo.java \
	ButtonInPane.java \
	ShowCircleCentered.java \
	ShowImage.java \
	ShowText.java \
	ShowLine.java \
	ShowRectangle.java

default: classes

classes: $(CLASSES:.java=.class)

MyFirstJavaFX: MyFirstJavaFX.class
	$(JVM) $(JavaFX) MyFirstJavaFX

MultipleStageDemo: MultipleStageDemo.class
	$(JVM) $(JavaFX) MultipleStageDemo

ButtonInPane: ButtonInPane.class
	$(JVM) $(JavaFX) ButtonInPane

ShowCircleCentered: ShowCircleCentered.class
	$(JVM) $(JavaFX) ShowCircleCentered

ShowImage: ShowImage.class
	$(JVM) $(JavaFX) ShowImage

ShowText: ShowText.class
	$(JVM) $(JavaFX) ShowText

ShowLine: ShowLine.class
	$(JVM) $(JavaFX) ShowLine

ShowRectangle: ShowRectangle.class
	$(JVM) $(JavaFX) ShowRectangle

clean:
	$(RM) *.class
