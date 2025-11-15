
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestContextedException {

    @Test
    public void test_addContextValue() {
        ContextedException obj = new ContextedException();
        ContextedException result = obj.addContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setContextValue() {
        ContextedException obj = new ContextedException();
        ContextedException result = obj.setContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getFirstContextValue() {
        ContextedException obj = new ContextedException();
        Object result = obj.getFirstContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getMessage() {
        ContextedException obj = new ContextedException();
        String result = obj.getMessage();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getRawMessage() {
        ContextedException obj = new ContextedException();
        String result = obj.getRawMessage();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getFormattedExceptionMessage() {
        ContextedException obj = new ContextedException();
        String result = obj.getFormattedExceptionMessage();
        assertNotNull(result); // Basic assertion
    }
    
}
