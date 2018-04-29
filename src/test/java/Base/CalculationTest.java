package Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void sumWithCapitalize() {
        assertEquals("3138.43", Calculation.sumWithCapitalize("10","1000","12"));
        assertEquals("7520.69", Calculation.sumWithCapitalize("5","5000","10"));
    }

    @Test
    void sumWithoutCapitalize() {
        assertEquals("1100.00", Calculation.sumWithoutCapitalize("10","1000","12"));
        assertEquals("5208.33", Calculation.sumWithoutCapitalize("5","5000","10"));
    }
}