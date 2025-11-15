
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestInitializationTask {

    @Test
    public void test_get() {
        InitializationTask obj = new InitializationTask();
        T result = obj.get();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_call() {
        InitializationTask obj = new InitializationTask();
        T result = obj.call();
        assertNotNull(result); // Basic assertion
    }
    
}
