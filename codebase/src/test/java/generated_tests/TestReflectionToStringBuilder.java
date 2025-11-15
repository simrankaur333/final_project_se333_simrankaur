
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestReflectionToStringBuilder {

    @Test
    public void test_toString() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_isAppendStatics() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        boolean result = obj.isAppendStatics();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_isAppendTransients() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        boolean result = obj.isAppendTransients();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reflectionAppendArray() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        ReflectionToStringBuilder result = obj.reflectionAppendArray();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setAppendStatics() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        void result = obj.setAppendStatics();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setAppendTransients() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        void result = obj.setAppendTransients();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setExcludeFieldNames() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        ReflectionToStringBuilder result = obj.setExcludeFieldNames();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setUpToClass() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        void result = obj.setUpToClass();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        ReflectionToStringBuilder obj = new ReflectionToStringBuilder();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
}
