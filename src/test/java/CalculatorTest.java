import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator objCalcUnderTest;

    @BeforeEach
    public void setUp() {
        objCalcUnderTest = new Calculator();
    }

    @Test
    @DisplayName("Add two numbers")
    void add() {
        Assert.assertEquals(35,objCalcUnderTest.add(15,20));
    }
    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        Assert.assertEquals(5,objCalcUnderTest.subtract(25,20));
    }
    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        Assert.assertEquals(30,objCalcUnderTest.multiply(15,2));
    }
    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        Assert.assertEquals(4, objCalcUnderTest.divide(8,2));
    }
}