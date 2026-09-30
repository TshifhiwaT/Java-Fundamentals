package Chapter4;

import java.util.Scanner;

public class ValueTypeMethods {
    public static void main(String[] args) {
        VoidMethods.displayMessage();
        System.out.println("Age: "+ getAge());
        System.out.println(isEven());
    }

    static int getAge(){
        int yeaOfBirth = 1995;
        int currentYear = 2026;

        return currentYear - yeaOfBirth;
    }

    static Scanner getScanner(){
        return new Scanner(System.in);
    }

    static boolean isEven(){
        int num;

        System.out.println("Enter a number to check if it is even");
        num = getScanner().nextInt();
        return (num%2 == 0);
    }
}
