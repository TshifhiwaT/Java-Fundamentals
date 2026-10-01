package Chapter5;

public class ArrayInitialization {
    public static void main(String[] args) {
        int[] arrNumbers = new int[]{1, 2, 3, 4, 5};
        String[] arrNames = new String[]{"kate", "Mike", "Carol", "David"};
        double[] arrPrices = new double[]{22.55, 52.74, 20.0, 52.99, 75.99};
        double[] arrSales = {500.00, 7500.00, 5500.00, 2500.55}; //values for arrays declared like this cannot be changed after declaration

        System.out.println("\n--------Numbers--------");
        for (int i =0; i < 5; i++){
            System.out.print(arrNumbers[i] + " | ");
        }

        System.out.println("\n--------Sales--------");
        for(double sale : arrSales){
            System.out.print(sale + " | ");
        }
    }

}
