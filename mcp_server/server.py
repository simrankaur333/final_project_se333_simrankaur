import os
from pathlib import Path
from fastmcp import FastMCP

mcp = FastMCP()

JAVA_SRC_DIR = "codebase/src/main/java"  # path to your Java source files
TEST_OUTPUT_DIR = "codebase/src/test/java/generated_tests"  # where tests will be written

# Ensure the test output directory exists
Path(TEST_OUTPUT_DIR).mkdir(parents=True, exist_ok=True)

def generate_test_method(class_name: str, method_name: str, return_type: str) -> str:
    """Create a simple JUnit test method for a given Java method."""
    default_value = {
        "int": "0",
        "boolean": "true",
        "double": "0.0",
        "float": "0.0f",
        "String": '"test"',
    }.get(return_type, "null")
    
    return f"""
    @Test
    public void test_{method_name}() {{
        {class_name} obj = new {class_name}();
        {return_type} result = obj.{method_name}();
        assertNotNull(result); // Basic assertion
    }}
    """

@mcp.tool()
def generate_junit_tests() -> str:
    """
    Analyze Java source code and generate JUnit test files.
    """
    import re
    
    java_files = list(Path(JAVA_SRC_DIR).rglob("*.java"))
    if not java_files:
        return "No Java files found."
    
    for file_path in java_files:
        # Use utf-8 with error handling to avoid decode errors
        try:
            with open(file_path, "r", encoding="utf-8", errors="ignore") as f:
                code = f.read()
        except Exception as e:
            print(f"Skipping {file_path}: {e}")
            continue
        
        # Find classes
        class_matches = re.findall(r"class (\w+)", code)
        for class_name in class_matches:
            # Find public methods (simple regex)
            methods = re.findall(r"public (\w+) (\w+)\(", code)
            test_methods = []
            for return_type, method_name in methods:
                test_methods.append(generate_test_method(class_name, method_name, return_type))
            
            if test_methods:
                test_class_code = f"""
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test{class_name} {{
{''.join(test_methods)}
}}
"""
                test_file_path = Path(TEST_OUTPUT_DIR) / f"Test{class_name}.java"
                with open(test_file_path, "w", encoding="utf-8") as f:
                    f.write(test_class_code)
    
    return f"Generated tests for {len(java_files)} Java files in {TEST_OUTPUT_DIR}."

@mcp.tool()
def analyze_coverage() -> str:
    """Parse JaCoCo XML report and summarize code coverage per class."""
    jacoco_file = Path("codebase/target/site/jacoco/jacoco.xml")
    if not jacoco_file.exists():
        return "JaCoCo report not found. Run `mvn test` first."
    # parse XML and summarize coverage
    import xml.etree.ElementTree as ET
    tree = ET.parse(jacoco_file)
    root = tree.getroot()
    coverage_summary = {}
    for pkg in root.findall(".//package"):
        for cls in pkg.findall("class"):
            name = cls.attrib["name"]
            lines = cls.findall("line")
            covered = sum(1 for l in lines if int(l.attrib["ci"]) > 0)
            total = len(lines)
            coverage_summary[name] = f"{covered}/{total}"
    return f"Coverage summary per class: {coverage_summary}"


if __name__ == "__main__":
    mcp.run(transport="sse")
