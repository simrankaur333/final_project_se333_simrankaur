from fastmcp import FastMCP

mcp = FastMCP()

@mcp.tool()
def add(a: float, b: float) -> float:
    """Basic calculator tool: add two numbers."""
    return a + b

if __name__ == "__main__":
    mcp.run(transport="sse")
