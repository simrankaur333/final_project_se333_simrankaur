
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMultiBackgroundInitializer {

    @Test
    public void test_addInitializer() {
        MultiBackgroundInitializer obj = new MultiBackgroundInitializer();
        void result = obj.addInitializer();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getResultObject() {
        MultiBackgroundInitializer obj = new MultiBackgroundInitializer();
        Object result = obj.getResultObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_isException() {
        MultiBackgroundInitializer obj = new MultiBackgroundInitializer();
        boolean result = obj.isException();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getException() {
        MultiBackgroundInitializer obj = new MultiBackgroundInitializer();
        ConcurrentException result = obj.getException();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_isSuccessful() {
        MultiBackgroundInitializer obj = new MultiBackgroundInitializer();
        boolean result = obj.isSuccessful();
        assertNotNull(result); // Basic assertion
    }
    
}
