import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheCloudsHackerRank {
    static int jumpingOnClouds(int[] c) {
        int initialCloud = 0;
        int jumpCounter = -1;
                while(true){
                    if(initialCloud + 1 > c.length-1 ){
                        return jumpCounter+1;
                    }
                    else if(initialCloud +2 > c.length-1){
                        return jumpCounter +2;
                    }
                    else{
                        if(c[initialCloud+2] != 1){
                            jumpCounter= jumpCounter+1;
                            initialCloud =initialCloud+2;

                        }
                        else if( c[initialCloud+1]  != 1){
                            initialCloud =initialCloud+1;
                            jumpCounter=jumpCounter+1;
                        }
                    }

                }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] c = {0,0,1,0,0,1,0};
        int result = jumpingOnClouds(c);
        System.out.println(result);
        scanner.close();
    }
}
