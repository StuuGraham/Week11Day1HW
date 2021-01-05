import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() { calculator = new Calculator(5.0, 2.0);}

    @Test
    public void canAdd(){
        assertEquals(7, calculator.addNumbers());
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtractNumbers());
    }

    @Test
    public void canMultiply(){
        assertEquals(10, calculator.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divideNumbers(), 0.01);
    }
}
