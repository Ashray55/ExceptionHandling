package exceptionHandling;

public class DeliverySlotUnavailableException extends RuntimeException {
    public DeliverySlotUnavailableException(String message) {
        super(message);
    }
}
