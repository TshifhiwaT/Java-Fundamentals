package Chapter2;

public class IfStatement {
    public static void main() {
        int a = 6, b =10;
        boolean c = true, d = false;

        //unary IF
        if(a > b)
            System.out.println("a is grater than b");

        //binary IF
        if(b > a){
            System.out.println("b is grater than a");
        }else{
            System.out.println("a is grater than or equal b");
        }
    }
}
