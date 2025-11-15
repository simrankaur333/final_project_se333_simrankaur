
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFraction {

    @Test
    public void test_getNumerator() {
        Fraction obj = new Fraction();
        int result = obj.getNumerator();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getDenominator() {
        Fraction obj = new Fraction();
        int result = obj.getDenominator();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getProperNumerator() {
        Fraction obj = new Fraction();
        int result = obj.getProperNumerator();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_getProperWhole() {
        Fraction obj = new Fraction();
        int result = obj.getProperWhole();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_intValue() {
        Fraction obj = new Fraction();
        int result = obj.intValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_longValue() {
        Fraction obj = new Fraction();
        long result = obj.longValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_floatValue() {
        Fraction obj = new Fraction();
        float result = obj.floatValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_doubleValue() {
        Fraction obj = new Fraction();
        double result = obj.doubleValue();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_reduce() {
        Fraction obj = new Fraction();
        Fraction result = obj.reduce();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_invert() {
        Fraction obj = new Fraction();
        Fraction result = obj.invert();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_negate() {
        Fraction obj = new Fraction();
        Fraction result = obj.negate();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_abs() {
        Fraction obj = new Fraction();
        Fraction result = obj.abs();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_pow() {
        Fraction obj = new Fraction();
        Fraction result = obj.pow();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_add() {
        Fraction obj = new Fraction();
        Fraction result = obj.add();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_subtract() {
        Fraction obj = new Fraction();
        Fraction result = obj.subtract();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_multiplyBy() {
        Fraction obj = new Fraction();
        Fraction result = obj.multiplyBy();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_divideBy() {
        Fraction obj = new Fraction();
        Fraction result = obj.divideBy();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_equals() {
        Fraction obj = new Fraction();
        boolean result = obj.equals();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_hashCode() {
        Fraction obj = new Fraction();
        int result = obj.hashCode();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_compareTo() {
        Fraction obj = new Fraction();
        int result = obj.compareTo();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toString() {
        Fraction obj = new Fraction();
        String result = obj.toString();
        assertNotNull(result); // Basic assertion
    }
    
    @Test
    public void test_toProperString() {
        Fraction obj = new Fraction();
        String result = obj.toProperString();
        assertNotNull(result); // Basic assertion
    }
    
}
