# SE333 Final Project – Phase 1–3

## Project Overview
This project implements an AI-assisted software testing agent using the Model Context Protocol (MCP).

- **Phase 1**: Environment setup, Python virtual environment configuration, MCP server setup, and connecting MCP server to VS Code.  
- **Phase 2**: Agent definition, tool configuration, and test generation capabilities.  
- **Phase 3**: Git automation MCP tools integrated into the workflow for streamlined version control.

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
  - Git tools are callable from the MCP server  
  - Workflow supports automatic commits when coverage thresholds are met  
  - Branch protection guidelines observed for main/master branches  
- Documentation added for each tool: usage, inputs, outputs, and example commands  

## Usage Instructions
1. Activate the Python virtual environment:  
    ```bash
    source .venv/bin/activate
    ```
2. Start the MCP server:  
    ```bash
    python server.py
    ```
3. Open VS Code Chat and connect to the MCP server (via MCP: Add Server)  
4. To use Git MCP tools:  
    - Run commands from the Chat interface or Python scripts  
    - Examples:  
      ```python
      git_status()
      git_add_all()
      git_commit("Add Phase 3 MCP tools")
      git_push()
      git_pull_request(base="main", title="Phase 3 submission", body="Add Git MCP tools")
      ```
5. For the agent, follow `.github/prompts/tester.prompt.md` guidelines when sending prompts in Chat.
