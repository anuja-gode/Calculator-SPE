import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5.0, Calculator.add(new java.util.Scanner("2 3")), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, Calculator.subtract(new java.util.Scanner("2 3")), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Calculator.multiply(new java.util.Scanner("2 3")), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(0.666, Calculator.divide(new java.util.Scanner("2 3")), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(Double.NaN, Calculator.divide(new java.util.Scanner("2 0")), 0.001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Calculator.squareRoot(new java.util.Scanner("4")), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120.0, Calculator.factorial(new java.util.Scanner("5")), 0.001);
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.609, Calculator.naturalLogarithm(new java.util.Scanner("5")), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(new java.util.Scanner("2 3")), 0.001);
    }
}
