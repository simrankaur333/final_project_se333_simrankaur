
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testcomment {

    @Test
    public void test_get() {
        comment obj = new comment();
        T result = obj.get();
        assertNotNull(result); // Basic assertion
    }
    
}
