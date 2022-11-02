import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected = 4;
        int result = calculator.add(2, 2);
        assertEquals(expected, result);
    }
}