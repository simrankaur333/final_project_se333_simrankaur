
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testof {

    @Test
    public void test_someMethodThatFiresAction() {
        of obj = new of();
        void result = obj.someMethodThatFiresAction();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_fire() {
        of obj = new of();
        L result = obj.fire();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_addListener() {
        of obj = new of();
        void result = obj.addListener();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_removeListener() {
        of obj = new of();
        void result = obj.removeListener();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_invoke() {
        of obj = new of();
        Object result = obj.invoke();
        assertNotNull(result); // Basic assertion
    }
    
}
