
output: Hello.class
	java Hello

Hello.class: Hello.java
	javac Hello.java

Sprite.class: sprite.java
	javac Hello.java



clean:
	rm *.class
