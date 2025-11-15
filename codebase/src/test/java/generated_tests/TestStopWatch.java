
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStopWatch {

    @Test
    public void test_start() {
        StopWatch obj = new StopWatch();
        void result = obj.start();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_stop() {
        StopWatch obj = new StopWatch();
        void result = obj.stop();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reset() {
        StopWatch obj = new StopWatch();
        void result = obj.reset();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_split() {
        StopWatch obj = new StopWatch();
        void result = obj.split();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_unsplit() {
        StopWatch obj = new StopWatch();
        void result = obj.unsplit();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_suspend() {
        StopWatch obj = new StopWatch();
        void result = obj.suspend();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_resume() {
        StopWatch obj = new StopWatch();
        void result = obj.resume();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getTime() {
        StopWatch obj = new StopWatch();
        long result = obj.getTime();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getNanoTime() {
        StopWatch obj = new StopWatch();
        long result = obj.getNanoTime();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getSplitTime() {
        StopWatch obj = new StopWatch();
        long result = obj.getSplitTime();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getSplitNanoTime() {
        StopWatch obj = new StopWatch();
        long result = obj.getSplitNanoTime();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getStartTime() {
        StopWatch obj = new StopWatch();
        long result = obj.getStartTime();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        StopWatch obj = new StopWatch();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toSplitString() {
        StopWatch obj = new StopWatch();
        String result = obj.toSplitString();
        assertNotNull(result); // Basic assertion
    }
    
}
