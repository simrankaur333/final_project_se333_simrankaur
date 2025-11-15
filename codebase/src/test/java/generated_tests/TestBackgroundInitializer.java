
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBackgroundInitializer {

    @Test
    public void test_get() {
        BackgroundInitializer obj = new BackgroundInitializer();
        T result = obj.get();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_call() {
        BackgroundInitializer obj = new BackgroundInitializer();
        T result = obj.call();
        assertNotNull(result); // Basic assertion
    }
    
}
