package Chapter2;

public class IncrementDecrement {
    public static void main() {
        int x = 4;
        //pre-increment
        System.out.println("Current value of x: " + x);
        System.out.println("Current value of x: " + ++x);

        //post-increment
        System.out.println("Current value of x: " + x++);

        //pr-decrement
        System.out.println("Current value of x: " + --x);

        //post-decrement
        System.out.println("Current value of x: " + x--);
    }
}
