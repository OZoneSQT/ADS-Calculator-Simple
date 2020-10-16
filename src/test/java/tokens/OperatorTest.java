package tokens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void getValue() {
        char myChar='+';
        Operator operator = new Operator(myChar);
        assertEquals(myChar,operator.getValue());
    }

}