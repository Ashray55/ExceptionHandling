package exceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Appointment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter appointment date (dd-mm-yyyy)");
        String date = sc.nextLine();

        try {
            validateAppointmentDate(date);
            System.out.println("Appointment date is valid: " + date);
        }catch (InvalidDateFormatException | PastDateException e){
            System.out.println(e.getMessage());
        }
    }

    private static void validateAppointmentDate(String dateStr) throws InvalidDateFormatException , PastDateException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        dateFormat.setLenient(false);

        //validate the format
        Date appointmentDate;
        try {
            appointmentDate = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new InvalidDateFormatException("Invalid date format. Please use dd-MM-yyyy.");
        }
        // Check if the date is in the past
        Date today = new Date();
        if (appointmentDate.before(today)) {
            throw new PastDateException("The appointment date cannot be in the past.");
        }
    }
}
