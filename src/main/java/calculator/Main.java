package calculator;

import tokens.Operand;
import tokens.Token;
import util.MyQueue;
import util.MyQueueInterface;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new Calculator();
        MyQueueInterface<Token> myTokens = new MyQueue<>(10);

        Token operand1 = new Operand(4);
        Token operand2 = new Operand(3);
        Token operand3 = new Operand(4);
        Token operator1 = new Operand('+');
        Token operator2 = new Operand('*');
        Token operand4 = new Operand(5);
        Token operator3  = new Operand('-');
        Token operand5 = new Operand(5);
        Token operator4  = new Operand('/');

        myTokens.enqueue(operand1);
        myTokens.enqueue(operand2);
        myTokens.enqueue(operand3);
        myTokens.enqueue(operator1);
        myTokens.enqueue(operator2);
        myTokens.enqueue(operand4);
        myTokens.enqueue(operator3);
        myTokens.enqueue(operand5);
        myTokens.enqueue(operator4);

        for(int i=0;i<myTokens.size();i++) {
            myTokens.dequeue().accept(visitor);
        }

        System.out.println("result is: " + visitor.peek());

    }

}
