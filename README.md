# Identifier-v0

## Description

Software Testing Teaching Examples Program - Maven/Java Version

The code of this product is part of a compiler for a language called Silly Pascal. It is responsible for validating whether identifiers are valid or not in this language.

A valid identifier contains only letters and digits. It must have a length between 1 and 6 characters, start with a letter, and the remaining characters can only be letters or digits.

The main method of this product is the ```public boolean validateIdentifier(String chain){...}```

## Code version for 2025/1 course

### Libraries

	- JDK 21
	- JUnit 5.13.2
	- JaCoCo 0.8.12
	- Pitest 1.20.0
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
java -jar lib/junit-platform-console-standalone-1.13.2.jar --cp target/test-classes:target/classes --scan-class-path
```

3.2) Running Test Suites with JUnit 5

```
java -jar lib/junit-platform-console-standalone-1.13.2.jar --cp target/test-classes:target/classes:lib/junit-platform-suite-api-1.13.2.jar:lib/junit-platform-suite-commons-1.13.2.jar:lib/junit-platform-suite-engine-1.13.2.jar --scan-class-path
```

## Collecting execution trace via command line

### Running with jacocoagent jacocoagent.jar

```
java -cp target/classes -javaagent:./lib/jacocoagent.jar=includes=*,destfile=./target/jacoco.exec,append=true identifier.IdentifierMain
```

### Report generation with jacococli.jar

```
java -jar ./lib/jacococli.jar report ./target/jacoco.exec --classfiles target/classes --html target/jacoco-report --name IdentifierReport --sourcefiles ./src/main/java
```

## Running tools via Maven

### Coverage 

```bash
mvn test
```

Coverage report generated at `target/site` directory


### Mutation Score


```bash
mvn org.pitest:pitest-maven:mutationCoverage
```

Mutation report generated at `target/pit-reports` directory
