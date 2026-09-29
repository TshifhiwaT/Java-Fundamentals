package Chapter2;

public class LogicalOperators {
    public static void main() {
        int a = 5, b = 25;
        boolean c = false;

        //equality
        System.out.println(a == b && c);
        //not equal
        System.out.println((a != b) || (a < b));
        //greater than
        System.out.println(a >( b /3));
        //less than
        System.out.println(b > a || c);

    }
}
