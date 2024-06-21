import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticTest {

    private Arithmetic arithmetic = new Arithmetic();

    @Test
    public void testAdd() {
        assertEquals(11, arithmetic.add(5, 6));
        assertEquals(-1, arithmetic.add(5, -6));
        assertEquals(-6, arithmetic.add(0, -6));
        assertEquals(0, arithmetic.add(6, -6));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, arithmetic.subtract(5, 6));
        assertEquals(11, arithmetic.subtract(17, 6));
        assertEquals(-6, arithmetic.subtract(0, 6));
        assertEquals(12, arithmetic.subtract(18, 6));
    }

    @Test
    public void testMultiply() {
        assertEquals(30, arithmetic.multiply(5, 6));
        assertEquals(-30, arithmetic.multiply(5, -6));
        assertEquals(0, arithmetic.multiply(0, -6));
        assertEquals(0, arithmetic.multiply(6, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, arithmetic.divide(5, 2), 0.0001);
        assertEquals(-2.5, arithmetic.divide(-5, 2), 0.0001);
        
        // Test division by zero should throw IllegalArgumentException
        try {
            arithmetic.divide(10, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
