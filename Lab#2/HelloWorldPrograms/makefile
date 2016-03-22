C = c\hello.c
CPP = cpp\hello.cpp
java = java\hello.java
python = python\hello.py
ruby = ruby\hello.rb

.PHONY: all c cpp java python ruby clean

all: c cpp java python ruby clean
	
c: $(C)
	@gcc -o hello $(C)
	@hello 

cpp: $(CPP)
	@g++ -o hello $(CPP)
	@hello

java: $(java)
	@javac $(java)
	@cd java && java HelloWorld

python: $(python)
	@python $(python)
	
ruby: $(ruby)
	@ruby $(ruby)
	
clean:
	@-rm -rf hello.exe
	@-rm -rf java\HelloWorld.class