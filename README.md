# SE333 Final Project – Phase 1–5

## Project Overview
This project implements an AI-assisted software testing agent using the Model Context Protocol (MCP).

- **Phase 1**: Environment setup, Python virtual environment configuration, MCP server setup, and connecting MCP server to VS Code.  
- **Phase 2**: Agent definition, tool configuration, and test generation capabilities.  
- **Phase 3**: Git automation MCP tools integrated into the workflow for streamlined version control.  
- **Phase 4**: Intelligent test iteration (planned), including coverage-based feedback loops and automated test improvements.  
- **Phase 5**: Creative extensions (planned), designing innovative MCP tools for additional test generation and code review.

## Phase 1 Deliverables Completed
- VS Code configured with MCP integration  
- Python virtual environment with MCP dependencies  
- MCP server implemented (`server.py`) and running  
- MCP tool tested with basic operations (calculator example)  
- `.github/prompts/tester.prompt.md` created for the agent prompt  

## Phase 2 Deliverables Completed
- Agent mode configured with:  
  - Tool: `generate_junit_tests`  
  - Model: `gpt-5-mini`  
  - Description of the agent’s purpose  
- Instructions added telling the agent how to:  
  - Analyze Java files in `codebase/src/main/java`  
  - Identify public methods and return types  
  - Generate JUnit tests into `codebase/src/test/java/generated_tests`  
  - Include assertions and method calls in each test  
  - Provide a summary of generated test files  
  - Report unreadable or non-UTF-8 Java files  
- Verified that the agent can be called from VS Code Chat  
- Folder structure confirmed compatible with test generation  

## Phase 3 Deliverables Completed
- Git MCP tools implemented:  
  1. `git_status()` – Returns current repository status, staged changes, and conflicts  
  2. `git_add_all()` – Stages all changes with filtering to exclude build artifacts and temporary files  
  3. `git_commit(message)` – Automated commits with standardized messages, includes coverage statistics  
  4. `git_push(remote="origin")` – Pushes changes to the remote repository with upstream configuration  
  5. `git_pull_request(base="main", title, body)` – Creates a pull request with standard templates and metadata  
- Integration verified:  
  - Git tools callable from the MCP server  
  - Workflow supports automatic commits when coverage thresholds are met  
  - Branch protection guidelines observed for main/master branches  
- Documentation added for each tool: usage, inputs, outputs, and example commands  

## Phase 4 & 5 – Planned/Conceptual
- **Agent Prompt Engineering**: Iterative test generation with feedback loop based on coverage results (planned).  
- **Automated Test Improvement**: Automatic enhancements based on coverage gaps; debugging failed tests (planned).  
- **Bug Fixing**: Identify and fix bugs using the agent (planned).  
- **Quality Metrics Dashboard**: Track assertions per test, edge case coverage, bug fixes (planned).  
- **Creative MCP Extensions**: Two innovative MCP tools to enhance testing agent:
  1. Specification-based testing generator (boundary value and equivalence class analysis)  
  2. AI code review agent (static analysis, code smells, refactoring suggestions)  

> **Note:** Phase 4/5 was conceptual due to resource limits (token constraints, generated test errors). All plans and designs are documented in `.github/prompts/tester.prompt.md` and README for future implementation.

## MCP Tool / API Documentation
### Tools Implemented:
1. **generate_junit_tests**
   - **Input:** Path to Java source files  
   - **Output:** JUnit test files in `codebase/src/test/java/generated_tests`  
   - **Command:** Via MCP Chat or Python call: `agent.generate_tests(path="codebase/src/main/java")`  
   - **Description:** Generates basic JUnit tests for public methods; reports unreadable files.  

2. **Git MCP Tools** (`git_status()`, `git_add_all()`, `git_commit(message)`, `git_push()`, `git_pull_request(...)`)
   - **Input/Output:** See Phase 3 documentation  
   - **Commands:** Callable via MCP Chat or Python scripts  
   - **Example:**  
     ```python
     git_status()
     git_add_all()
     git_commit("Add Phase 3 MCP tools")
     git_push()
     git_pull_request(base="main", title="Phase 3 submission", body="Add Git MCP tools")
     ```

## Installation & Configuration
1. Clone repository  
2. Install `uv` and MCP dependencies:
   ```bash
   uv init
   uv venv
   source .venv/bin/activate
   uv add mcp[cli] httpx fastmcp
3. Start MCP server:
    python3 mcp_server/server.py
4. Cnonect to VSCode Chat: 
    - Press CTRL+SHIFT+P → MCP: Add Server
    - Paste MCP server URL
    - Confirm server connection

## Troubleshooting & FAQ
- MCP server not responding: Ensure virtual environment activated; check server is running on correct port.
- Git tools fail: Confirm repository is initialized and on a valid branch; exclude build artifacts.
- Agent fails to generate tests: Ensure Java files are UTF-8 encoded; generated tests may require manual fixes.
- Maven build errors on generated tests: These are expected due to incomplete test generation; phase 4 planned to resolve.
