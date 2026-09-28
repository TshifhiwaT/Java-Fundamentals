package Chapter1;

import java.util.Scanner;

public class UserInput {
    public static void main() {
        //declare
        String name;
        int age;
        double height;
        Scanner sc = new Scanner(System.in);

        //assign variables to user input
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }
}
