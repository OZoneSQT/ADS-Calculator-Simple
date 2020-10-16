package tokens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    @Test
    void getValue() {
        double myValue = 8.3;
        Operand operator = new Operand(myValue);
        assertEquals(myValue,operator.getValue());
    }

}