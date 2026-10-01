package Chapter5;

public class DeclaringArrays {
    public static void main(String[] args) {
        int[] arrNumbers = new int[5];
        String[] arrNames = new String[5];
        double[] arrPrices = new double[5];

        arrNumbers[0] = 5;
        arrNumbers[1] = 6;
        arrNumbers[2] = 8;
        arrNumbers[3] = 52;
        arrNumbers[4] = 26;

        arrNames[0] = "James";
        arrNames[1] = "Carol";
        arrNames[2] = "Mike";
        //arrNames[3] = "James";
        //arrNames[4] = "James";

        arrPrices[0] = 25.63;
        arrPrices[1] = 17.33;
        arrPrices[2] = 2.50;
    }
}
