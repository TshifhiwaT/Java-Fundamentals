package Chapter3;

public class ForLoop {
    public static void main() {
        //Display Java 5 Times
        //single condition
        for(int x = 1; x <= 5; x++){
            System.out.println("Java");
        }
        //multiple conditions
        for(int x = 1, y = 10; x <= 5 || y >= 0; x++, y--){
            System.out.println(x + " - "+ y);
        }
    }
}
