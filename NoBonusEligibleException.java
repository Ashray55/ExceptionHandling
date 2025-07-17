package exceptionHandling;

public class NoBonusEligibleException extends RuntimeException {
    public NoBonusEligibleException(String message) {
        super(message);
    }
}
