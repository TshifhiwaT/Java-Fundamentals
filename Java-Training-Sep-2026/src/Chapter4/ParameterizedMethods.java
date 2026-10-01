package Chapter4;

import javax.swing.*;

public class ParameterizedMethods {
    public static void main(String[] args) {
        int num, yearOfBirth;
        System.out.print("Enter a number to check if it is even: ");
        num = ValueTypeMethods.getScanner().nextInt();
        System.out.println("Is Even: "+ isEven(num));

        yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter year of birth"));
        System.out.println("Age: "+ intAge(yearOfBirth));
    }

    static int intAge(int yearOfBirth){
        final int CURRENT_YEAR = 2026;
        return CURRENT_YEAR -yearOfBirth;
    }

    static boolean isEven(int num){
        return (num%2 == 0);
    }
}
