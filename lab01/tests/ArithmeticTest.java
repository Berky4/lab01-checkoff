import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticTest {

    private Arithmetic arithmetic = new Arithmetic();

    @Test
    public void testAdd() {
        assertEquals(5, arithmetic.add(2, 3));
        assertEquals(-1, arithmetic.add(2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, arithmetic.subtract(2, 3));
        assertEquals(5, arithmetic.subtract(8, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, arithmetic.multiply(2, 3));
        assertEquals(-15, arithmetic.multiply(5, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, arithmetic.divide(5, 2), 0.0001);
        assertEquals(-3.0, arithmetic.divide(9, -3), 0.0001);
        
        // Test division by zero should throw IllegalArgumentException
        try {
            arithmetic.divide(10, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
