package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tokens.Operand;
import tokens.Operator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Visitor visitor;
    private Operator operator1;
    private Operand operand1, operand2;

    @BeforeEach
    void setUp() {
        this.visitor = new Calculator();
    }

    @Test
    void addition(){
        double myOperand1 = 2;
        double myOperand2 = 3;
        char myOperator = '+';

        operand1 = new Operand(myOperand1);
        operand2 = new Operand(myOperand2);
        operator1 = new Operator(myOperator);

        operand1.accept(visitor);
        operand2.accept(visitor);
        operator1.accept(visitor);

        assertEquals(myOperand1 + myOperand2, visitor.peek());
    }

    @Test
    void subtraction(){
        double myOperand1 = 2;
        double myOperand2 = 3;
        char myOperator = '-';

        operand1 = new Operand(myOperand1);
        operand2 = new Operand(myOperand2);
        operator1 = new Operator(myOperator);

        operand1.accept(visitor);
        operand2.accept(visitor);
        operator1.accept(visitor);

        assertEquals(myOperand1 - myOperand2, visitor.peek());
    }

    @Test
    void multiplication(){
        double myOperand1 = 2;
        double myOperand2 = 3;
        char myOperator = '*';

        operand1 = new Operand(myOperand1);
        operand2 = new Operand(myOperand2);
        operator1 = new Operator(myOperator);

        operand1.accept(visitor);
        operand2.accept(visitor);
        operator1.accept(visitor);

        assertEquals(myOperand1 * myOperand2, visitor.peek());
    }

    @Test
    void division(){
        double myOperand1 = 2;
        double myOperand2 = 3;
        char myOperator = '/';

        operand2 = new Operand(myOperand2);
        operand1 = new Operand(myOperand1);
        operator1 = new Operator(myOperator);

        operand2.accept(visitor);
        operand1.accept(visitor);
        operator1.accept(visitor);

        assertEquals(myOperand1 / myOperand2, visitor.peek());
    }

}