
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMultiBackgroundInitializerResults {

    @Test
    public void test_addInitializer() {
        MultiBackgroundInitializerResults obj = new MultiBackgroundInitializerResults();
        void result = obj.addInitializer();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getResultObject() {
        MultiBackgroundInitializerResults obj = new MultiBackgroundInitializerResults();
        Object result = obj.getResultObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_isException() {
        MultiBackgroundInitializerResults obj = new MultiBackgroundInitializerResults();
        boolean result = obj.isException();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getException() {
        MultiBackgroundInitializerResults obj = new MultiBackgroundInitializerResults();
        ConcurrentException result = obj.getException();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_isSuccessful() {
        MultiBackgroundInitializerResults obj = new MultiBackgroundInitializerResults();
        boolean result = obj.isSuccessful();
        assertNotNull(result); // Basic assertion
    }
    
}
