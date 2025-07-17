package exceptionHandling;

import java.util.Scanner;

public class ATMCashWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double withdrawalAmount;
        double balance = 1000;

       try {
           //accept withdrawal amount
           System.out.println("Enter withdrawal amount");
           withdrawalAmount = sc.nextDouble();

           //check for valid amount
           if (withdrawalAmount < 0 || withdrawalAmount % 100 != 0){
               System.out.println("Amount must be non negative multiple of 100");
           }
           if ( withdrawalAmount > balance){
               System.out.println("Insufficient fund for this transaction");
           }
           //process withdrawal
           balance -= withdrawalAmount;
           System.out.println("withdrawal successfully!! , New balance : "+balance+ " Rs" );

       }catch (InsufficientFundsException | InvalidAmountException e){
           System.out.println(e.getMessage());
       } catch (Exception e) {
           System.out.println("Unexpected error occurred : "+ e.getMessage());
       }finally {
           System.out.println("Transaction complete!!");
       }

    }


}

