package Chapter1;

public class ExploreStrings {
    public static void main() {
        String sentence = "In Java, variables must be declared before they can be used.";

        //number of characters
        System.out.println("Length: "+ sentence.length());
        //position of
        System.out.println("Position: " + sentence.indexOf("v", 6));//5
        //character at position 10
        System.out.println("10th position has: " + sentence.charAt(10));
        //Last position of a from position 15
        System.out.println(("Position: " + sentence.lastIndexOf("a", 15)));
    }
}
