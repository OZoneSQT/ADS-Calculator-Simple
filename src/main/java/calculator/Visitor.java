package calculator;

import tokens.Operand;
import tokens.Operator;

public interface Visitor {

    /**
     * Set Visitor object to be an Operator
     * @param operator
     */
    void visit(Operator operator);

    /**
     * Set Visitor object to be an Operand
     * @param operand
     */
    void visit(Operand operand);

    /**
     * Show last operand added to stack
     * @return
     */
    double peek();

}
