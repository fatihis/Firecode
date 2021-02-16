import java.io.*;

public class CountingValleysHackerRank {

    public static int countingValleys(int steps, String path) {
        int currentLevel = 0;
        int peaks=0;
        char[] pathArray = path.toCharArray();

        for(int i = 0; i< steps; i++){
            if(pathArray[i] == 'U'){
                currentLevel++;
            }
            else if (pathArray[i] == 'D'){
                currentLevel--;
            }
            if( currentLevel == 0 && pathArray[i] == 'U'){
                peaks++;
            }
        }
        return peaks;


    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleysHackerRank.countingValleys(steps, path);

        System.out.println(result);
    }
}
