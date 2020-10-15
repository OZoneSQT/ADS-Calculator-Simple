package calculator;

import tokens.Operand;
import tokens.Operator;

public interface Visitor {
    void visit(Operator operand);
    void visit(Operand operand);
    double peek();

}
