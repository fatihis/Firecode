import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatedStringHackerRank {
    static long repeatedString(String s, long n) {

        return n- n%s.length();
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);
        scanner.close();
    }
}
