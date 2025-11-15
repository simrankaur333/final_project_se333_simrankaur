
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestImmutablePair {

    @Test
    public void test_getLeft() {
        ImmutablePair obj = new ImmutablePair();
        L result = obj.getLeft();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getRight() {
        ImmutablePair obj = new ImmutablePair();
        R result = obj.getRight();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setValue() {
        ImmutablePair obj = new ImmutablePair();
        R result = obj.setValue();
        assertNotNull(result); // Basic assertion
    }
    
}
