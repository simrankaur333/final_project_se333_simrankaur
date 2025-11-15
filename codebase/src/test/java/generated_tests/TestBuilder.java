
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBuilder {

    @Test
    public void test_getThreadCount() {
        Builder obj = new Builder();
        long result = obj.getThreadCount();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_newThread() {
        Builder obj = new Builder();
        Thread result = obj.newThread();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_wrappedFactory() {
        Builder obj = new Builder();
        Builder result = obj.wrappedFactory();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_namingPattern() {
        Builder obj = new Builder();
        Builder result = obj.namingPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_daemon() {
        Builder obj = new Builder();
        Builder result = obj.daemon();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_priority() {
        Builder obj = new Builder();
        Builder result = obj.priority();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_uncaughtExceptionHandler() {
        Builder obj = new Builder();
        Builder result = obj.uncaughtExceptionHandler();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reset() {
        Builder obj = new Builder();
        void result = obj.reset();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_build() {
        Builder obj = new Builder();
        BasicThreadFactory result = obj.build();
        assertNotNull(result); // Basic assertion
    }
    
}
