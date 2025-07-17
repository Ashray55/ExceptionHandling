package exceptionHandling;

public class OverSpeedException extends RuntimeException {
    public OverSpeedException(String message) {
        super(message);
    }
}
