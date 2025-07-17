package exceptionHandling;

public class OnlineDelivery {
    private final static int OpeningHr = 9;
    private final static int ClosingHr = 21;

    public static void validateDeliverySlot(int timeSlot) throws DeliverySlotUnavailableException{
        if (timeSlot < OpeningHr || timeSlot >= ClosingHr){
            throw new DeliverySlotUnavailableException("Delivery is available between 9 AM to 9 PM");
        }
    }

    public static void main(String[] args) {
        try {
            int requestedTimeSlot = 12;

            validateDeliverySlot(requestedTimeSlot);
            System.out.println("Delivery slot at " +
                    (requestedTimeSlot <= 12 ? requestedTimeSlot + " AM" : (requestedTimeSlot - 12) + " PM") +
                    " is confirmed!");
        } catch (DeliverySlotUnavailableException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}

