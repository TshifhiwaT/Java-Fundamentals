package Chapter3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main() {
        //prompt the user for any number of integers
        //calculate their sum and average
        //enter zero to stop the program
        int count = 1, sum =0;
        double average = 0;
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        number = sc.nextInt();

        do{
            System.out.print("Enter any integer: ");
            number = sc.nextInt();
            sum += number;
            count++;
        }while (number != 0);

        average = sum/count;
        System.out.format("""
                Sum:         %d
                Average:     %.2f""", sum,average);
    }



}
