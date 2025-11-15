# SE333 Final Project – Phase 1

## Project Overview
This project implements an AI-assisted software testing agent using the Model Context Protocol (MCP).  
Phase 1 covers environment setup, Python virtual environment configuration, MCP server setup, and connecting the MCP server to VS Code.

## Phase 1 Deliverables Completed
- VS Code configured with MCP integration
- Python virtual environment with MCP dependencies
- MCP server implemented (`server.py`) and running
- MCP tool tested with basic operations (calculator example)
- `.github/prompts/tester.prompt.md` created for the agent prompt

## Usage
1. Activate the virtual environment:
    source .venv/bin/activate
2. Start the MCP server:
    python server.py
3. Open Chat in VSCode, and ensure it is connected to the MCP.