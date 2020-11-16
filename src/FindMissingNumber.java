public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        //sort array
        for(int i=0 ; i< arr.length ; i++ ){
            for(int j=i; j<arr.length; j++){
                if(i != j && arr[j] < arr[i]  ){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //looking for missing one
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return 9;
    }
}
