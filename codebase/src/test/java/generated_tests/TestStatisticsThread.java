
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStatisticsThread {

    @Test
    public void test_run() {
        StatisticsThread obj = new StatisticsThread();
        void result = obj.run();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getPeriod() {
        StatisticsThread obj = new StatisticsThread();
        long result = obj.getPeriod();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getUnit() {
        StatisticsThread obj = new StatisticsThread();
        TimeUnit result = obj.getUnit();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_run() {
        StatisticsThread obj = new StatisticsThread();
        void result = obj.run();
        assertNotNull(result); // Basic assertion
    }
    
}
