package exceptions;

public class WrongAccountException extends NullPointerException {

    public WrongAccountException() {
        super("This account does not exist.");
    }

}
