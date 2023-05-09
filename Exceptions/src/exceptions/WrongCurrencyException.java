package exceptions;

public class WrongCurrencyException extends IllegalArgumentException {
    public WrongCurrencyException() {
        super("The account has another currency");
    }
}
