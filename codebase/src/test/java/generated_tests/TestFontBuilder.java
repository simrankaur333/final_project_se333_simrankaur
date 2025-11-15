
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFontBuilder {

    @Test
    public void test_bold() {
        FontBuilder obj = new FontBuilder();
        FontBuilder result = obj.bold();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_size() {
        FontBuilder obj = new FontBuilder();
        FontBuilder result = obj.size();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_build() {
        FontBuilder obj = new FontBuilder();
        Font result = obj.build();
        assertNotNull(result); // Basic assertion
    }
    
}
