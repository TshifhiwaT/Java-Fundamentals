package Chapter2;

public class ExploreOperators {
    public static void main() {
        //declare
        int a, b;
        //assignment
        a = 5;
        b = 15;
        System.out.println("----Assign----");
        System.out.println("Current value of a: " + a);
        System.out.println("Current value of b: " + b);
        //add and assign
        a += 6;
        b += 3;
        System.out.println("----Add and Assign----");
        System.out.println("Current value of a: " + a);
        System.out.println("Current value of b: " + b);
        //subtract and assign
        a -= 3;
        b -= 6;
        System.out.println("----Subtract and Assign----");
        System.out.println("Current value of a: " + a);
        System.out.println("Current value of b: " + b);
        //multiply and assign
        a *= 2;
        b *= 3;
        System.out.println("----Multiply and Assign----");
        System.out.println("Current value of a: " + a);
        System.out.println("Current value of b: " + b);
        //divide and assign
        a /= 2;
        b /= 3;
        System.out.println("----Divide and Assign----");
        System.out.println("Current value of a: " + a);
        System.out.println("Current value of b: " + b);
    }

}
