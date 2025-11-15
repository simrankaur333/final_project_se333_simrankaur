
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDefaultExceptionContext {

    @Test
    public void test_addContextValue() {
        DefaultExceptionContext obj = new DefaultExceptionContext();
        DefaultExceptionContext result = obj.addContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setContextValue() {
        DefaultExceptionContext obj = new DefaultExceptionContext();
        DefaultExceptionContext result = obj.setContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getFirstContextValue() {
        DefaultExceptionContext obj = new DefaultExceptionContext();
        Object result = obj.getFirstContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getFormattedExceptionMessage() {
        DefaultExceptionContext obj = new DefaultExceptionContext();
        String result = obj.getFormattedExceptionMessage();
        assertNotNull(result); // Basic assertion
    }
    
}
