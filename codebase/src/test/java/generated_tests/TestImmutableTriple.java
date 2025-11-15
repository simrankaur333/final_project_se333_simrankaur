
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestImmutableTriple {

    @Test
    public void test_getLeft() {
        ImmutableTriple obj = new ImmutableTriple();
        L result = obj.getLeft();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getMiddle() {
        ImmutableTriple obj = new ImmutableTriple();
        M result = obj.getMiddle();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getRight() {
        ImmutableTriple obj = new ImmutableTriple();
        R result = obj.getRight();
        assertNotNull(result); // Basic assertion
    }
    
}
