package exceptionHandling;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        double average;

        try {
            //accept marks for 3 subject
            for ( int i = 0; i < 3; i++ ){
                System.out.println("Enter mark for subject " + (i + 1) + "(0-100)");
                marks[i] = sc.nextInt();

                //validate marks
                if (marks[i] < 0 || marks[i] > 100){
                    throw new InvalidMarksException("Marks must be between 0 and 100");
                }
            }
            //calculate average
            average = (marks[0] + marks[1] + marks[2]) / 3.0 ;

            //check average and throw exception if necessary
            if (average < 35){
                throw new FailException("You have failed. Average is below 35 ");
            }else {
                System.out.println("You have passed with average is  " + average);

                //showing grade
                if (average >= 80){
                    System.out.println("Grade A");
                } else if (average >= 60) {
                    System.out.println("Grade B");
                } else if (average >= 35) {
                    System.out.println("Grade C");
                }
            }
        }catch (InvalidMarksException | FailException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred :" +e.getMessage());
        }
    }
}
