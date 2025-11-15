
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testas {

    @Test
    public void test_bold() {
        as obj = new as();
        FontBuilder result = obj.bold();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_size() {
        as obj = new as();
        FontBuilder result = obj.size();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_build() {
        as obj = new as();
        Font result = obj.build();
        assertNotNull(result); // Basic assertion
    }
    
}
