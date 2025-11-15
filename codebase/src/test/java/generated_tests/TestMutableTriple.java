
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMutableTriple {

    @Test
    public void test_getLeft() {
        MutableTriple obj = new MutableTriple();
        L result = obj.getLeft();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setLeft() {
        MutableTriple obj = new MutableTriple();
        void result = obj.setLeft();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getMiddle() {
        MutableTriple obj = new MutableTriple();
        M result = obj.getMiddle();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setMiddle() {
        MutableTriple obj = new MutableTriple();
        void result = obj.setMiddle();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getRight() {
        MutableTriple obj = new MutableTriple();
        R result = obj.getRight();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setRight() {
        MutableTriple obj = new MutableTriple();
        void result = obj.setRight();
        assertNotNull(result); // Basic assertion
    }
    
}
