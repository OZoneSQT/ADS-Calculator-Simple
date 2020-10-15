package calculator;

import tokens.Operand;
import tokens.Token;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new Calculator();
        ArrayList<Token> myTokens = new ArrayList<>();

        Token operand1 = new Operand(4);
        Token operand2 = new Operand(3);
        Token operand3 = new Operand(4);
        Token operator1 = new Operand('+');
        Token operator2 = new Operand('*');
        Token operand4 = new Operand(5);
        Token operator3  = new Operand('-');
        Token operand5 = new Operand(5);
        Token operator4  = new Operand('/');

        myTokens.add(operand1);
        myTokens.add(operand2);
        myTokens.add(operand3);
        myTokens.add(operator1);
        myTokens.add(operator2);
        myTokens.add(operand4);
        myTokens.add(operator3);
        myTokens.add(operand5);
        myTokens.add(operator4);

        for(int i=0;i<myTokens.size();i++) {
            myTokens.get(i).accept(visitor);
        }
        System.out.println("result is: " + visitor.peek());
    }

}
