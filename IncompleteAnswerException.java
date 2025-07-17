package exceptionHandling;

public class IncompleteAnswerException extends RuntimeException {
    public IncompleteAnswerException(String message) {
        super(message);
    }
}
