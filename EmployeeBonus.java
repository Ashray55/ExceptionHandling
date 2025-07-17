package exceptionHandling;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int experience;
        int rating;
        double bonus;

        try {
            //accept employee experience
            System.out.println("Enter employee experience(in years)");
            experience = sc.nextInt();
            if (experience < 0){
                throw new InvalidExperienceException("Experience can not be negative");
            }
            //accept performance rating
            System.out.println("Enter performance rating(1-5)");
            rating = sc.nextInt();
            if (rating < 1 || rating > 5){
                throw new InvalidRatingException("Rating must be 1 to 5");
            }
            //check for bonus eligibility
            if (rating == 1 || rating == 2){
                throw new NoBonusEligibleException("No bonus eligible for performance rating of 1 or 2");
            }
            //calculate bonus based on experience and rating
            if (experience < 2){
                bonus = 1000*rating;  //less than 2 years
            } else if (experience < 5) {
                bonus = 2000*rating;
            }else {
                bonus = 3000*rating;
            }
            System.out.println("The calculate bonus is : "+ bonus + " Rs ");
        }catch (InvalidExperienceException | InvalidRatingException | NoBonusEligibleException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: "+ e.getMessage());
        }
    }
}
