
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMutablePair {

    @Test
    public void test_getLeft() {
        MutablePair obj = new MutablePair();
        L result = obj.getLeft();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setLeft() {
        MutablePair obj = new MutablePair();
        void result = obj.setLeft();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getRight() {
        MutablePair obj = new MutablePair();
        R result = obj.getRight();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setRight() {
        MutablePair obj = new MutablePair();
        void result = obj.setRight();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setValue() {
        MutablePair obj = new MutablePair();
        R result = obj.setValue();
        assertNotNull(result); // Basic assertion
    }
    
}
