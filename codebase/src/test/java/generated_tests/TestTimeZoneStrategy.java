
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTimeZoneStrategy {

    @Test
    public void test_getPattern() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        String result = obj.getPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getTimeZone() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        TimeZone result = obj.getTimeZone();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getLocale() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        Locale result = obj.getLocale();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parseObject() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        Object result = obj.parseObject();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_parse() {
        TimeZoneStrategy obj = new TimeZoneStrategy();
        Date result = obj.parse();
        assertNotNull(result); // Basic assertion
    }
    
}
