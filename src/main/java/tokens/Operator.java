package tokens;

import calculator.Visitor;

public class Operator extends Token {
    private char value;

    public Operator(char operatorValue) {
        this.value = operatorValue;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public char getValue() {
        return value;
    }

}
