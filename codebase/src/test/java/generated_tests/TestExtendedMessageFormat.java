
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExtendedMessageFormat {

    @Test
    public void test_toPattern() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        String result = obj.toPattern();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setFormat() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        void result = obj.setFormat();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setFormatByArgumentIndex() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        void result = obj.setFormatByArgumentIndex();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setFormats() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        void result = obj.setFormats();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_setFormatsByArgumentIndex() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        void result = obj.setFormatsByArgumentIndex();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        ExtendedMessageFormat obj = new ExtendedMessageFormat();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
}
