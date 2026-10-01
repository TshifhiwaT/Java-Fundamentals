package Chapter5;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] arrStudent= new String[]{"John", "Kate", "Jessica", "Lerato", "Carol"};
        int[][] arrTestScores = new int [][]{
                {74, 63, 70}, //row1
                {69, 74, 59},//row2
                {88, 71, 73},//row 3
                {78, 87, 94},//row 4
                {96, 74, 81}
        };

        System.out.println("name\tTest 1\tTest 2\tTest 3");

        for(int row=0; row <arrStudent.length; row++){
            System.out.print(arrStudent[row] + "\t");
            for (int col = 0; col < arrTestScores[row].length; col++){
                System.out.print(arrTestScores[row][col] + "\t\t");
            }
            System.out.println();
        }
    }
}
