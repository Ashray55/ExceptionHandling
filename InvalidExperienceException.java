package exceptionHandling;

public class InvalidExperienceException extends RuntimeException {
    public InvalidExperienceException(String message) {
        super(message);
    }
}
