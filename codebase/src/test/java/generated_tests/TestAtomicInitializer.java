
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAtomicInitializer {

    @Test
    public void test_get() {
        AtomicInitializer obj = new AtomicInitializer();
        T result = obj.get();
        assertNotNull(result); // Basic assertion
    }
    
}
