import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length ;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return 11;
    }
    public static int missingNumber2(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length ;i++){
            if(arr[i] != arr[i+1]-1){
                return arr[i+1]-1;
            }
        }
        return 11;
    }

}
