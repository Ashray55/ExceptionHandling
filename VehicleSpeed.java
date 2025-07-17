package exceptionHandling;

import java.util.Scanner;

public class VehicleSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
          // accept speed from user
            System.out.println("Enter speed of vehicle");
            double speed = sc.nextDouble();

            if (speed > 120){
                throw new OverSpeedException("Your Speed is greater than 120 km/h");
            }
            if (speed < 0){
                throw new InvalidSpeedException("Your speed is invalid");
            }
            System.out.println("Your speed is normal");
        }catch (OverSpeedException | InvalidSpeedException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred : "+ e.getMessage());
        }finally {
            System.out.println(" Drive Safe !!!");
        }
    }
}
