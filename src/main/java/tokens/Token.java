package tokens;

import calculator.Visitor;

public abstract class Token {
    public abstract void accept(Visitor visitor);
}
