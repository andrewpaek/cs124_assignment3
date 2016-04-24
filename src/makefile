JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		annealing.java \
		Hill_Climbing.java \
		input_generator.java \
		karp.java \
		jarp_main.java \
		Main.java \
		maxheap.java \
		package-info.java \
		random.java \
		Rep_1.java \
		Rep_2.java \
		Repeated_Random \
		representation

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class