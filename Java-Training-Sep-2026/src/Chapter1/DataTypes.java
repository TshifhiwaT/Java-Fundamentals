package Chapter1;

/**
 * @author : Tshifhiwa Thekhwe
 */
public class DataTypes {
    public static void main() {
        //Declare
        int intAge;
        short number = 5;
        long longAge =25;
        double salary = 5000.00;
        float wage = 5000.00f;
        boolean isEmployed;
        char letter = 'A';
        String day = "Today is Monday";

        //Assign
        intAge = 36;
        isEmployed = false;

        //use
        System.out.println("Age (" + intAge + ", " + longAge + ")");
        System.out.println("Salary: " + salary);
        System.out.println("Wage: " + wage);
        System.out.println("Employed? "+ isEmployed);
        System.out.println("letter: " + letter);
        System.out.println(day);
    }


}
