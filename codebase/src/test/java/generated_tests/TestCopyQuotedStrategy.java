
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCopyQuotedStrategy {

    @Test
    public void test_getPattern() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        String result = obj.getPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getTimeZone() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        TimeZone result = obj.getTimeZone();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getLocale() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        Locale result = obj.getLocale();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        CopyQuotedStrategy obj = new CopyQuotedStrategy();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
}
