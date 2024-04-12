package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calculator newCalc;

    @Test
    void testAdd()
    {
        newCalc= new Calculator();
        assertEquals(10,newCalc.add(4,6));
    }
    @Test
    void testSubtract()
    {
        newCalc= new Calculator();
        assertEquals(2,newCalc.subtract(6,4));
    }
}
