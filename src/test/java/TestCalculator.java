import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void calculatorCanAdd() {
        Calculator calculator = new Calculator(2, 3);
        assertEquals(5, calculator.add());
    }

    @Test
    public void calculatorCanSubtract() {
        Calculator calculator = new Calculator(10, 8);
        assertEquals(2, calculator.subtract());
    }

    @Test
    public void calculatorCanMultiply() {
        Calculator calculator = new Calculator(30, 3);
        assertEquals(90, calculator.multiply());
    }

    @Test
    public void calcultorCanDivide(){
        Calculator calculator = new Calculator(30, 3);
        assertEquals(10, calculator.divide() );
    }
}