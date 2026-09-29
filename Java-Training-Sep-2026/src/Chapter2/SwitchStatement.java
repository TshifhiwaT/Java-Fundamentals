package Chapter2;

public class SwitchStatement {
    public static void main() {
        String module = "TypeScript";
        String lecturer;
        //Smith (Java, SQL), Carol (C#, VB), James (Python, JavaScript, TypeScript)

        switch(module){
            case "Java":
            case "SQL": lecturer = "Smith";
            break;
            case "C#":
            case "VB": lecturer = "Carol";
            break;
            case "Python":
            case "JavaScript":
            case "TypeScript": lecturer = "James";
            break;
            default: lecturer = "Invalid module";
        }
        System.out.println("lecturer for Module "+ module + " is " + lecturer);

    }
}
