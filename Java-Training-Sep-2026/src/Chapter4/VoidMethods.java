package Chapter4;

public class VoidMethods {
    public static void main(String[] args) {
        displayMessage();
    }

    static void displayMessage(){
        System.out.println("Hi, welcome to Java training");
    }

    public static void displayAddress(){
        System.out.println("""
                123 Main Street
                Rivonia
                Sandton
                0123""");
    }
}
