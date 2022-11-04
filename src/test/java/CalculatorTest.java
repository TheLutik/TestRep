import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.management.remote.MBeanServerForwarder;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void mul() {
        Calculator calculator = new Calculator();
        double expected = 4;
        double result = calculator.mul(2, 2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double expected = 10;
        double result = calculator.divide(100, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void WhenInputIncorrectValueThenThrowException() {
        boolean wasException = false;
        try {
            calculator.divide(100, 0);
        } catch (Exception e) {
            wasException = true;
        }
        assertTrue(wasException);
    }
}