
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriple {

    @Test
    public void test_compareTo() {
        Triple obj = new Triple();
        int result = obj.compareTo();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        Triple obj = new Triple();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        Triple obj = new Triple();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        Triple obj = new Triple();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        Triple obj = new Triple();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
}
