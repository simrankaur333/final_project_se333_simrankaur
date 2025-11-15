
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLazyInitializer {

    @Test
    public void test_get() {
        LazyInitializer obj = new LazyInitializer();
        T result = obj.get();
        assertNotNull(result); // Basic assertion
    }
    
}
