package Chapter1;

import java.util.Scanner;

public class Exercise3 {
    public static void main() {
        //Declare
        double adultTotal = 0;
        double childTotal = 0;
        double mealsTotal = 0;
        int countAdult = 0;
        int countChild = 0;
        Scanner sc = new Scanner(System.in);

        //prompt and take in user input
        System.out.println("Enter the total number of adult meals ordered: ");
        countAdult = sc.nextInt();
        System.out.println("Enter the total number of children meals ordered: ");
        countChild = sc.nextInt();

        //calculate total made from the adult and children meals
        adultTotal = countAdult * 50;
        childTotal = countChild * 37.50;
        mealsTotal = adultTotal + childTotal;

        System.out.println("Adult Meals Total: " + adultTotal);
        System.out.println("Children Meals Total: " + childTotal);
        System.out.println("Total Amount: " + mealsTotal);
    }

}
