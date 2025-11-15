
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFastDateParser {

    @Test
    public void test_getPattern() {
        FastDateParser obj = new FastDateParser();
        String result = obj.getPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getTimeZone() {
        FastDateParser obj = new FastDateParser();
        TimeZone result = obj.getTimeZone();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getLocale() {
        FastDateParser obj = new FastDateParser();
        Locale result = obj.getLocale();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        FastDateParser obj = new FastDateParser();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        FastDateParser obj = new FastDateParser();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        FastDateParser obj = new FastDateParser();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        FastDateParser obj = new FastDateParser();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        FastDateParser obj = new FastDateParser();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        FastDateParser obj = new FastDateParser();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        FastDateParser obj = new FastDateParser();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
}
