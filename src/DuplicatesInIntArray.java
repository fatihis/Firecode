import java.util.ArrayList;

public class DuplicatesInIntArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,1,5};
        System.out.println(duplicate(arr));
    }

    public static String duplicate(int[] numbers){
        ArrayList<Integer> dublicates = new ArrayList<>();

for(int i=0; i<numbers.length-1;i++){
    for(int j=i; j<numbers.length-1; j++){
        if(i!=j){
            if(numbers[i]==numbers[j]){
                dublicates.add(numbers[i]);

            }
        }
    }
}

return dublicates.toString();



    }
}
