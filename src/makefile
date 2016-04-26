JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		annealing.java \
		hill_climbing.java \
		input_generator.java \
		karp.java \
		main.java \
		maxheap.java \
		package-info.java \
		random.java \
		rep_1.java \
		rep_2.java \
		repeated_random.java \
		representation.java \
		kk.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class