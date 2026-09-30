package Chapter2;

import java.util.Scanner;

public class Excercise2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        char bedSize;
        int view;
        double price = 0;

        System.out.println("Select option for Bed Type \n" +
                "A. Queen \n" +
                "B. King \n" +
                "C. King and Pullout Couch");
        bedSize = sc.next().toUpperCase().charAt(0);

        switch(bedSize){
            case 'A':
                price = 125;
                break;
            case 'B':
                price = 139;
                break;
            case 'C':
                price =165;
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        if(price > 0){
            System.out.println("Enter view option \n" +
                    "1. Lake view \n" +
                    "2. Park view");
            view = sc.nextInt();

            if(view == 1){
                price += 15;
                System.out.println("Total room price: " + price);
            } else if (view == 2) {
                System.out.println("Total room price: " + price);
            }else{
                System.out.println("Invalid view selected");
            }
        }
    }
}
