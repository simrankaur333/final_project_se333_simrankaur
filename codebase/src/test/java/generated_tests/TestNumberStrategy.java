
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestNumberStrategy {

    @Test
    public void test_getPattern() {
        NumberStrategy obj = new NumberStrategy();
        String result = obj.getPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getTimeZone() {
        NumberStrategy obj = new NumberStrategy();
        TimeZone result = obj.getTimeZone();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getLocale() {
        NumberStrategy obj = new NumberStrategy();
        Locale result = obj.getLocale();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        NumberStrategy obj = new NumberStrategy();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        NumberStrategy obj = new NumberStrategy();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        NumberStrategy obj = new NumberStrategy();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        NumberStrategy obj = new NumberStrategy();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        NumberStrategy obj = new NumberStrategy();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        NumberStrategy obj = new NumberStrategy();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        NumberStrategy obj = new NumberStrategy();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
}
