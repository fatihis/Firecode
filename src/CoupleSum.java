import java.util.Arrays;
import java.util.Collections;

public class CoupleSum {
    /*Given an array of integers, find two numbers such that they sum up to a specific target.
The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2.
Please note that the indices are not zero based, and you can assume that each input has exactly one solution. Target linear runtime and space complexity.

Example:
Input Array : {2, 3, 4, 7}
Target      : 7
Output      : {2, 3}*/
    public static int[] coupleSum(int[] numbers, int target) {

        for(int i = 0; i < numbers.length; i++){
            for(int j = 1; j < numbers.length; j++){
                if(i !=j){
                    if((numbers[i]+numbers[j]) == target){
                        int[] arr = {i+1,j+1};
                        return arr;
                    }
                }
            }
        }


        return numbers;
    }
}
