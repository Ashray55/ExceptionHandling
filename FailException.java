package exceptionHandling;

public class FailException extends RuntimeException {
    public FailException(String message) {
        super(message);
    }
}
