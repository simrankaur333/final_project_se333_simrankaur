
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testdefines {

    @Test
    public void test_getThreadCount() {
        defines obj = new defines();
        long result = obj.getThreadCount();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_newThread() {
        defines obj = new defines();
        Thread result = obj.newThread();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_wrappedFactory() {
        defines obj = new defines();
        Builder result = obj.wrappedFactory();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_namingPattern() {
        defines obj = new defines();
        Builder result = obj.namingPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_daemon() {
        defines obj = new defines();
        Builder result = obj.daemon();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_priority() {
        defines obj = new defines();
        Builder result = obj.priority();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_uncaughtExceptionHandler() {
        defines obj = new defines();
        Builder result = obj.uncaughtExceptionHandler();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reset() {
        defines obj = new defines();
        void result = obj.reset();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_build() {
        defines obj = new defines();
        BasicThreadFactory result = obj.build();
        assertNotNull(result); // Basic assertion
    }
    
}
