import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class MyNumberTest
{
    private MyNumber number1, number2;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Run @Before");
        number1 = new MyNumber(11);
        number2 = new MyNumber(22);
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("Run @After");
    }

    @Test
    public void testGetterSetter()
    {
        System.out.println("Run @Test testGetterSetter");
        int value = 33;
        number1.setNumber(value);
        assertEquals(value,number1.getNumber());
    }

    @Test
    public void testAdd()
    {
        System.out.println("Run @Test testAdd");
        assertEquals("error in add()", 33, number1.add(number2).getNumber());
        assertEquals("error in add()", 55, number1.add(number2).getNumber());
    }

    @Test
    public void testDiv()
    {
        System.out.println("Run @Test testDiv");
        assertEquals("error in div()", 2, number2.div(number1).getNumber());
        assertEquals("error in div()", 0, number2.div(number1).getNumber());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero()
    {
        System.out.println("Run @Test testDivByZero");
        number2.setNumber(0);
        number1.div(number2);
    }


}
