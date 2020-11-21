import java.util.ArrayList;

public class mergeTwoSortedArray {
    /* The idea behind the classic Mergesort algorithm is to divide an array in half, sort each half, and then use
a merge() method to merge the two halves into a single sorted array.


Implement the merge() method that takes in
two sorted arrays and returns a third sorted array that contains elements of both the input arrays.

You can assume
that the input arrays will always be sorted in ascending order and can have different sizes.


Examples:

merge({2,5,7,8,9},{9}) -> {2,5,7,8,9,9}
merge()({7,8},{1,2}) -> {1,2,7,8}
merge()({2},{}) -> {2}
   {} -> [Empty] Array*/
    public static void main(String[] args) {
        int[] arrL = {2,5,7,8,9,12};
        int[] arrR = {1,3,6,11};
        merge(arrL,arrR);
    }


    public static void merge(int[] arrLeft, int[] arrRight){

        ArrayList<Integer> mergedArrayList = new ArrayList<>();
        for (int i = 0 ; i< arrLeft.length-1; i++ ){
            mergedArrayList.add(arrLeft[i]);
        }
        // arrLeft is in
        int position = 0;
        for(int i = 0; i < arrRight.length-1; i++ ){
            for(int j = i ; j < mergedArrayList.size(); j++)
            if(arrRight[i] < mergedArrayList.get(j)){
                mergedArrayList.add(j,arrRight[i]);
            }
        }
        Integer [] mergedArray = mergedArrayList.toArray(new Integer[0]);


        for (int element: mergedArray
             ) {
            System.out.println(element);
        }
    }
}
