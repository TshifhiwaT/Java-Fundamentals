package Chapter2;

public class TernaryOperator {
    public static void main() {
        //condition ? trueResults : falseResults
        int age = 15, number = 19;
        String feedback;

        if(age >= 18){
            feedback = "you can vote";
        }else{
            feedback = "sorry you cannot vote";
        }
        System.out.println(feedback);

        age = 21;
        //variable = condition ? trueResults : falseResults
        feedback = (age >= 18) ? "you can vote" : "sorry you cannot vote";
        System.out.println(feedback);

        System.out.println((5 >= 15) ? "Yes it is greater than" : "No it is not greater than");

        System.out.println((number%2 == 0) ? "even" :
                (number %3 == 0) ? "Multiple of 3" : "Odd");
    }
}
