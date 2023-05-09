package exceptions;

public class WrongCurrencyException extends NullPointerException {


    public WrongCurrencyException() {
        super("This Currency does not exist");
    }
}
