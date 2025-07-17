package exceptionHandling;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] correntAnswers = new String[5];
        String[] userAnswers = new String[5];

        //input correct answer
        System.out.println("Enter a correct answer for 5 questions.");
        for (int i = 0; i < 5; i++){
            System.out.println("Question" + (i+1) + " : ");
            correntAnswers[i] = sc.nextLine();
        }
        //input user answer
        for (int i = 0; i < 5; i++){
            System.out.println("Question" + (i+1) + " : ");
            correntAnswers[i] = sc.nextLine();
        }
        try {
            validateAnswers(userAnswers);
            int score = calculateScore(correntAnswers,userAnswers);
            System.out.println("Your Score "+ score + " Out of 5");
        }catch (IncompleteAnswerException e){
            System.out.println(e.getMessage());
        }
    }
    private static void validateAnswers(String[] answers) throws IncompleteAnswerException{
        for (String answer : answers){
            if(answer.trim().isEmpty()){
                throw new IncompleteAnswerException("You have left an answer blank. Please complete all answers");
            }
        }
    }
    private static int calculateScore(String[] correntAnswers, String[] userAnswers) {
        int score = 0;
        for (int i = 0; i<correntAnswers.length; i++){
            if(correntAnswers[i].equalsIgnoreCase(userAnswers[i])){
                score++;
            }
        }
        return score;
    }


}
