import com.cglx.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testMultiplication()
    {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 10);
        Assert.assertEquals(100, result);
    }

    @Test
    public void testAddition()
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        Assert.assertEquals(30, result);
    }

    @Test
    public void testSubstraction()
    {
        Calculator calculator = new Calculator();
        int result = calculator.substract(860, 250);
        Assert.assertEquals(610, result);
    }

    @Test
    public void testDivision()
    {
        Calculator calculator = new Calculator();
        int result = calculator.divide(100, 10);
        Assert.assertEquals(10, result);
    }

   
}
