package tokens;

public class TokenValue<AnyType> {
    private AnyType data;
    private TokenValue<AnyType> next;

    public TokenValue(AnyType data, TokenValue<AnyType> next) {
        this.data=data;
        this.next=next;
    }

}
