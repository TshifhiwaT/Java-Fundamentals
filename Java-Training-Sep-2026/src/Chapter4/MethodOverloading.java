package Chapter4;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calculateSum());

        System.out.format("""
                sum (collection):     %d
                sum (two integers:    %d
                sum (three integers:  %d
                sum (doubles):        %.2f
                sum(float)            %.2f""",
                calculateSum(5,6,7,8,9), calculateSum(5,6), calculateSum(5,6,7),
                calculateSum(6.8, 9.11), calculateSum(3.63f, 5.38f));
    }

    /**
     * This method calculate and return the sum of two integers
     * @param x first integer value
     * @param y second integer value
     * @return the sum of two integers
     */
    static int calculateSum(int x, int y){
        return x + y;
    }

    /**
     * Calculate the sum of two doubles
     * @param x first double value
     * @param y second double value
     * @return sum of two doubles
     */
    static double calculateSum(double x, double y){
        return x + y;
    }

    /**
     * Calculate the sum of two floats
     * @param x first float value
     * @param y second float value
     * @return sum of two floats
     */
    static float calculateSum(float x, float y){
        return x + y;
    }

    /**
     * Sum of three integers
     * @param x first integer value
     * @param y second integer value
     * @param z third integer value
     * @return sum of three integers
     */
    static int calculateSum(int x, int y, int z){
        return x + y + z;
    }

    /**
     * sum of a collection of numbers
     * @param numbers collection of integer numbers
     * @return sum of all integers in the collection
     */
    static int calculateSum(int... numbers){
        return Arrays.stream(numbers).sum();
    }
}
