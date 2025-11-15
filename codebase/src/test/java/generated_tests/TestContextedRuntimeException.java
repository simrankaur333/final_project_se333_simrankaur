
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestContextedRuntimeException {

    @Test
    public void test_addContextValue() {
        ContextedRuntimeException obj = new ContextedRuntimeException();
        ContextedRuntimeException result = obj.addContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setContextValue() {
        ContextedRuntimeException obj = new ContextedRuntimeException();
        ContextedRuntimeException result = obj.setContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getFirstContextValue() {
        ContextedRuntimeException obj = new ContextedRuntimeException();
        Object result = obj.getFirstContextValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getMessage() {
        ContextedRuntimeException obj = new ContextedRuntimeException();
        String result = obj.getMessage();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getRawMessage() {
        ContextedRuntimeException obj = new ContextedRuntimeException();
        String result = obj.getRawMessage();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getFormattedExceptionMessage() {
        ContextedRuntimeException obj = new ContextedRuntimeException();
        String result = obj.getFormattedExceptionMessage();
        assertNotNull(result); // Basic assertion
    }
    
}
