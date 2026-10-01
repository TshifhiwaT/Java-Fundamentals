package Chapter4.Exercise;
/*Write a program that will allow a student to enter their details (first name, last name,
birth year, test mark). The program should determine the grade of the student based
on their test mark. Create the following methods:
• greetings() – the method should display a greeting message.
• determineGrade(testMark) – the method should receive a test mark, determines, and
return  the grade.
• determineAge(year) -  the method receives the student’s birth year, determines, and
returns the current age of the student.
• displayOutput() – the method should display the details of the student as follows: first
name, last name, age, and grade.*/

import java.util.Scanner;

public class Student {

    public static String firstName = "";
    public static String lastName = "";
    public static int age = 0;
    private static String grade = "";

    public static void main(String[] args) {
        int birthYear = 0;
        double testMark = 0;
        greetings();

        System.out.print("Enter Your First Name: ");
        firstName = input().nextLine();

        System.out.print("Enter Your Last Name: ");
        lastName = input().nextLine();

        System.out.print("Enter The Year You Were Born: ");
        birthYear = input().nextInt();

        System.out.print("Enter Your Test Mark: ");
        testMark = input().nextDouble();

        grade = determineGrade(testMark);
        age = determineAge(birthYear);

        displayOutput();

    }

    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static void greetings(){
        System.out.println("Hello! Hi!!");
    }

    public static String determineGrade(double testMark){
        String result;
        if(testMark >= 0 && testMark < 40){
            result = "F";
        }else if(40 <= testMark && testMark <= 49){
            result = "D-";
        }else if(50 <= testMark && testMark <= 59){
            result = "D";
        }else if(60 <= testMark && testMark <= 69){
            result = "C";
        }else if(70 <= testMark && testMark <= 79){
            result = "B";
        }else if(80 <= testMark && testMark <= 89){
            result = "A";
        }else if(testMark >= 90){
            result = "A+";
        }else{
            result = "Invalid Test Mark entered";
        }
        return result;
    }

    public static int determineAge(int year){
        return 2026 - year;
    }

    public static void displayOutput(){
        System.out.format("""
                First Name:    %s
                Last Name:     %s
                Age:           %d
                Grade:         %s""", firstName, lastName, age, grade);
    }

}
