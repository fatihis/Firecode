public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 3,7,1,2,11,4,6,5,8};
        selectionSortArray(array);
        for (int s:
             array) {
            System.out.print(s);
        }
    }
    public static int[] selectionSortArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            int min =arr[i];
            for(int j = i; j < arr.length; j++){
                if(i != j){
                    if(arr[i] > arr[j] ){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
