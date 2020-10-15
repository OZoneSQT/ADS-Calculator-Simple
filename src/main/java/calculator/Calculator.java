package calculator;

import tokens.Operand;
import tokens.Operator;
import util.StackInterface;
import util.StackLIFO;

public class Calculator implements Visitor {
    private StackInterface stackInterface = new StackLIFO();

    @Override
    public void visit(Operand operand) {
        stackInterface.push(operand.getValue());
    }

    @Override
    public double peek() {
        return (double) stackInterface.peek();
    }

    @Override
    public void visit(Operator operator) {
        double value1 = (double) stackInterface.pop();
        double value2 = (double) stackInterface.pop();

        switch (operator.getValue()) {
            case '+':
                stackInterface.push(value2 + value1);
                break;
            case '-':
                stackInterface.push(value2 - value1);
                break;
            case '*':
                stackInterface.push(value2 * value1);
                break;
            case '/':
                stackInterface.push(value1 / value2);
                break;
        }
    }

}
