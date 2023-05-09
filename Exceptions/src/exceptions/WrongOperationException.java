package exceptions;

public class WrongOperationException extends IllegalArgumentException {
    public WrongOperationException() {
        super("The Balance is less than the required amount");
    }
}
