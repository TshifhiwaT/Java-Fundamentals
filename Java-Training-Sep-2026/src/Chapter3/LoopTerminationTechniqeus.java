package Chapter3;

public class LoopTerminationTechniqeus {
    public static void main() {
        //break: end/exit the loop
        //continue:will skip the current iteration and start the iteration

        //break
        for (int i = 1; i <= 10; i++){
            if (i == 5) break;
            System.out.print(i + " | ");
        }

        //continue
        for(int i = 0; i <= 15; i++){
            if(i %3 ==0) continue;
            System.out.print(i + " | ");
        }

        //continue + break
        for(int i = 0; i <= 15; i++){
            if(i == 5) break;
            if(i == 3) continue;
            System.out.print(i+" | ");
        }
    }
}
