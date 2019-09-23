import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10.0, calculator.add(4.0, 6.0), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(5.0, calculator.subtract(11.0, 6.0), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(20.0, calculator.multiply(2.0, 10.0), 0.01);
    }

   
}
