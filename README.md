# Identifier-v0

## Description

Software Testing Teaching Examples Program - Maven/Java Version

The code of this product is part of a compiler for a language called Silly Pascal. It is responsible for validating whether identifiers are valid or not in this language.

A valid identifier contains only letters and digits. It must have a length between 1 and 6 characters, start with a letter, and the remaining characters can only be letters or digits.

The main method of this product is the ```public boolean validateIdentifier(String chain){...}```

## Code version for 2024/1 course

### Libraries

	- JDK 11
	- JUnit 5.10.2
	- JaCoCo 
	- SonarQube 


## Compilation and Test Execution with JUnit


1) Compile Sources

```
	mvn clean compile
```	

2) Compile Tests

```
	mvn clean test-compile
```

3) Execute Tests

3.1) Running individual tests with JUnit 5 via command line:

```
	java -jar lib/junit-platform-console-standalone-1.8.2.jar --cp target/test-classes:target/classes --scan-class-path
```

3.2) Running Test Suites with JUnit 5

```
	java -jar lib/junit-platform-console-standalone-1.8.2.jar --cp target/test-classes:target/classes:lib/junit-platform-suite-api-1.8.2.jar:lib/junit-platform-suite-commons-1.8.2.jar:lib/junit-platform-suite-engine-1.8.2.jar --scan-class-path
```