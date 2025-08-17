# Mockito GraalVM Example

A simple Maven Java 21 project demonstrating Mockito usage with GraalVM native image compilation.

## Prerequisites

- Java 21
- GraalVM 21
- Maven

## Running the Application

### Regular JVM Tests

```bash
mvn test
```

### GraalVM Native Image Workflow

#### 1. Generate Metadata Files

Use the `native-agent` profile to generate GraalVM metadata files:

```bash
mvn test -Pnative-agent
```

This runs tests with the GraalVM tracing agent and generates configuration files in `src/main/resources/META-INF/native-image/`.

#### 2. Run Native Tests

Use the `native` profile to compile and run tests in native mode:

```bash
mvn test -Pnative
```

This compiles the tests into a native executable and runs them.

## Project Structure

- `Main.java` - Entry point with `getMessage()` method
- `MessageClass.java` - Simple class returning "Hello GraalVM"
- `MainTest.java` - Unit test using Mockito to mock MessageClass

## Maven Profiles

- **`native-agent`** - Generates GraalVM metadata files using the tracing agent
- **`native`** - Compiles and runs tests in GraalVM native mode
