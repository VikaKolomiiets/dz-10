package exceptions;

public class WrongOperationException extends IllegalArgumentException {
    public WrongOperationException() {
        super("The account does not have enough funds for the required amount");
    }
}
