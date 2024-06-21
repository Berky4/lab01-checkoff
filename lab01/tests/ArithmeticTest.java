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
}
