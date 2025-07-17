package exceptionHandling;

import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            //Accept age from user
            System.out.println("Enter your age : ");
            int age = sc.nextInt();

            //accept nationality from new user
            System.out.println("Enter your nationality :");
            String nationality = sc.next();
            sc.nextLine();

            if ( age < 18){
                throw new ageException("You are not eligible to vote because you are underage");
            }
            if (!nationality.equalsIgnoreCase("Indian")){
                throw new nationalityException("You are not eligible to vote because of your nationality");
            }
            System.out.println("You are eligible to vote");

        }catch (ageException | nationalityException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred : " + e.getMessage());
        }finally {
            System.out.println("Thank you for using voter eligibility checker");
        }
    }
}
