
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBasicThreadFactory {

    @Test
    public void test_getThreadCount() {
        BasicThreadFactory obj = new BasicThreadFactory();
        long result = obj.getThreadCount();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_newThread() {
        BasicThreadFactory obj = new BasicThreadFactory();
        Thread result = obj.newThread();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_wrappedFactory() {
        BasicThreadFactory obj = new BasicThreadFactory();
        Builder result = obj.wrappedFactory();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_namingPattern() {
        BasicThreadFactory obj = new BasicThreadFactory();
        Builder result = obj.namingPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_daemon() {
        BasicThreadFactory obj = new BasicThreadFactory();
        Builder result = obj.daemon();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_priority() {
        BasicThreadFactory obj = new BasicThreadFactory();
        Builder result = obj.priority();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_uncaughtExceptionHandler() {
        BasicThreadFactory obj = new BasicThreadFactory();
        Builder result = obj.uncaughtExceptionHandler();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reset() {
        BasicThreadFactory obj = new BasicThreadFactory();
        void result = obj.reset();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_build() {
        BasicThreadFactory obj = new BasicThreadFactory();
        BasicThreadFactory result = obj.build();
        assertNotNull(result); // Basic assertion
    }
    
}
