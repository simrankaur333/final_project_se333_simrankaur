
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testmust {

    @Test
    public void test_get() {
        must obj = new must();
        T result = obj.get();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_call() {
        must obj = new must();
        T result = obj.call();
        assertNotNull(result); // Basic assertion
    }
    
}
