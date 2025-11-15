
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCharSet {

    @Test
    public void test_contains() {
        CharSet obj = new CharSet();
        boolean result = obj.contains();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        CharSet obj = new CharSet();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        CharSet obj = new CharSet();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        CharSet obj = new CharSet();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
}
