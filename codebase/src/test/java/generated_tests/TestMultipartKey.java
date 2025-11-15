
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMultipartKey {

    @Test
    public void test_getInstance() {
        MultipartKey obj = new MultipartKey();
        F result = obj.getInstance();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getInstance() {
        MultipartKey obj = new MultipartKey();
        F result = obj.getInstance();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        MultipartKey obj = new MultipartKey();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        MultipartKey obj = new MultipartKey();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
}
