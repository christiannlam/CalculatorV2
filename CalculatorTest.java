import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals("error in add()", 3, Calculator.add(1, 2));
        assertEquals("error in add()", -3, Calculator.add(-1, -2));
        assertEquals("error in add()", 9, Calculator.add(9, 0));
    }

    @Test
    public void testAddFail() {
        assertNotEquals("error in add()", 0, Calculator.add(1, 2));
    }

    @Test
    public void testSub() {
        assertEquals("error in sub()", 1, Calculator.sub(2, 1));
        assertEquals("error in sub()", -1, Calculator.sub(-2, -1));
        assertEquals("error in sub()", 0, Calculator.sub(2, 2));
    }

    @Test
    public void testSubFail()
    {
        assertNotEquals("error in sub()", 0, Calculator.sub(2, 1));
    }

    @Test
    public void testMul() {
        assertEquals(2, Calculator.mul(2, 1));
        assertEquals(2, Calculator.mul(-2, -1));
        assertEquals(4, Calculator.mul(2, 2));
    }

    @Test
    public void testDivInt() {
        assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
        assertEquals("error in divInt()", 0, Calculator.divInt(1, 9));
    }

    @Test
    public void testDivIntFail()
    {
        assertNotEquals("error in divInt()", 1, Calculator.divInt(9, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivIntByZero()
    {
        Calculator.divInt(9, 0);
    }

    @Test
    public void testDivReal() {
        assertEquals("error in divInt()", 0.333333, Calculator.divReal(1, 3), 1e-6);
        assertEquals("error in divInt()", 0.111111, Calculator.divReal(1, 9), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class) public void testDivRealByZero()
    {
        Calculator.divReal(9, 0);
    }
}