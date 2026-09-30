package Chapter3.Exercises;

/*Write an application that prompts a user for the number of years the user has until
retirement and the amount of money the user can save annually. If the user enters 0 or a
negative number for either value, prompt the user again until valid entries are made.
Assume that no interest is earned on the money. Display the amount of money the user
will have at retirement. Save the file as RetirementGoal.java.*/

import java.util.Scanner;

public class RetirmentGoal {
    public static void main() {
        int noYears = 0;
        double amount = 0;
        double estimate = 0;
        boolean bool = true;
        Scanner sc = new Scanner(System.in);


        do{
            System.out.println("Enter Number of Years left Till Retirement: ");
            noYears = sc.nextInt();
            if(noYears <= 0){
                System.out.println("Number of years should be greater than 0");
            }
        }while(noYears <= 0);

        do{
            System.out.println("Enter Amount you can save annually: ");
            amount = sc.nextDouble();
            if(amount <= 0){
                System.out.println("Amount should be greater than 0");
            }
        }while(amount <= 0);



        estimate = noYears * amount;

        System.out.format("You Could Save: %.2f", estimate);
    }
}
