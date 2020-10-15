package tokens;

import calculator.Visitor;

public class Operand extends Token {
    private double value;

    public Operand(double operandValue) {
        this.value = operandValue;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getValue() {
        return value;
    }

}