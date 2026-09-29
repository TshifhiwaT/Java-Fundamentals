package Chapter2;

public class NestedIfStatement {
    public static void main() {
        int creditScore = 500;
        double salary = 15000;
        boolean employmentStatus = true;
        String feedback = "Declined";

        if(employmentStatus){
            if(salary >= 1500){
                if(creditScore >= 600){
                    feedback = "Approved";
                }else if(creditScore >= 500 && creditScore <= 599){
                    feedback = "Approved with condition";
                }else{
                    feedback = "Declined (Low credit score";
                }
            }else{
                feedback = "You need to earn at least R15 000.00";
            }
        }else{
            feedback = "You need to be employed";
        }
        System.out.println(feedback);
    }
}
