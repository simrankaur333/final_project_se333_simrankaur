
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testmaintains {

    @Test
    public void test_getThreadCount() {
        maintains obj = new maintains();
        long result = obj.getThreadCount();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_newThread() {
        maintains obj = new maintains();
        Thread result = obj.newThread();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_wrappedFactory() {
        maintains obj = new maintains();
        Builder result = obj.wrappedFactory();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_namingPattern() {
        maintains obj = new maintains();
        Builder result = obj.namingPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_daemon() {
        maintains obj = new maintains();
        Builder result = obj.daemon();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_priority() {
        maintains obj = new maintains();
        Builder result = obj.priority();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_uncaughtExceptionHandler() {
        maintains obj = new maintains();
        Builder result = obj.uncaughtExceptionHandler();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reset() {
        maintains obj = new maintains();
        void result = obj.reset();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_build() {
        maintains obj = new maintains();
        BasicThreadFactory result = obj.build();
        assertNotNull(result); // Basic assertion
    }
    
}
