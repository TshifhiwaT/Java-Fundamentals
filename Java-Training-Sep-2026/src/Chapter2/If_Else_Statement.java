package Chapter2;

public class If_Else_Statement {
    public static void main() {
        int a = 5, b = 10;
        boolean c = true, d = false;

        if (a == b) {
            System.out.println("a is b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else if (a > b) {
            System.out.println("a is grater than b");
        }else if(a%3 == 0){
            System.out.println("a is a multiple of 3");
        }else{
            System.out.println("Imposible");
        }

    }
}
