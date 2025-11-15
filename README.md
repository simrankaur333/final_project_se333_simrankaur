# SE333 Final Project – Phase 1, 2

## Project Overview
This project implements an AI-assisted software testing agent using the Model Context Protocol (MCP).  
Phase 1 covers environment setup, Python virtual environment configuration, MCP server setup, and connecting the MCP server to VS Code.
Phase 2 adds the agent definition, tool configuration, and test generation capabilities.

## Phase 1 Deliverables Completed
- VS Code configured with MCP integration
- Python virtual environment with MCP dependencies
- MCP server implemented (`server.py`) and running
- MCP tool tested with basic operations (calculator example)
- `.github/prompts/tester.prompt.md` created for the agent prompt

## Phase 2 Deliverables Completed
- Agent mode configured with:
    - Tool: generate_junit_tests
    - Model: gpt-5-mini
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

## Usage
1. Activate the virtual environment:
    source .venv/bin/activate
2. Start the MCP server:
    python server.py
3. Open VSCode Chat, and ensure it is connected to the MCP.
4. Adhere to tester.prompt.md (add it as context) and provide prompts with that guideline.