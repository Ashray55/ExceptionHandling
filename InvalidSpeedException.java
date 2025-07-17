package exceptionHandling;

public class InvalidSpeedException extends RuntimeException {
    public InvalidSpeedException(String message) {
        super(message);
    }
}
