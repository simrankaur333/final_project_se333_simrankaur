---
mode: "agent"
tools: [`generate_junit_tests`, `analyze_coverage`]
description: "This agent generates JUnit test cases for a Java Maven project by analyzing method signatures, producing executable tests with basic assertions, and analyzing coverage using JaCoCo reports."
model: 'Gpt-5 mini'
---

## Instructions for the agent:

1. Analyze all Java source files in the project under `codebase/src/main/java`.
2. For each class, identify all public methods and their return types.
3. Generate JUnit test classes in `codebase/src/test/java/generated_tests`.
4. Ensure each test method:
   - Instantiates the class.
   - Calls the target method.
   - Contains at least one assertion (e.g., `assertNotNull` for return values).
5. Skip any Java files containing non-UTF-8 characters, but report their filenames in the summary.
6. Return a summary of:
   - How many tests were generated.
   - Where the test files were stored.
   - Any skipped files due to errors.
7. After generating the tests, run `mvn test` in the `codebase` folder so that the coverage tool can provide an accurate report.
8. Use the `analyze_coverage` tool to summarize coverage per class from the JaCoCo XML report.
9. Optionally, suggest improvements or additional edge cases to increase coverage.

### Example Prompts to the Agent:

- "Generate tests for all classes in the project and summarize the output."
- "Analyze codebase, create JUnit tests with assertions, and provide coverage report."
- "List any skipped Java files and suggest ways to improve coverage."
