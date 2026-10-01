package Chapter5;

public class ParallelArrys {
    public static void main(String[] args) {
        String[] arrStudent= new String[]{"John", "Kate", "Jessica", "Lerato", "Carol"};
        int[] arrTest1 = new int[]{74, 56, 85, 78, 63};
        int[] arrTest2 = new int[]{63, 69, 55, 38, 96};
        int[] arrTest3 = new int[]{79, 84, 75, 83, 63};

        System.out.println("Name\t\tTest 1\tTest 2\tTest 3");
        for (int i = 0; i < arrStudent.length; i++){
            System.out.println(arrStudent[i] + "\t\t" + arrTest1[i] + "\t\t" + arrTest2[i] + "\t\t" + arrTest3[i]);
        }
    }
}
