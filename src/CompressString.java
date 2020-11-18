import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        //test
        compressString("heeyy");
    }
    /*
    * Compress a sorted String by replacing instances of repeated characters with the character followed by the count of the character.


compressString("aaabbbbbcccc") --> a3b5c4
compressString("aabbbbccc") --> a2b4c3
compressString("abc") --> abc


Note: This kind of compression will only be effective when the count of consecutive identical characters is greater than 1.*/
    //As it says only consecutive chars will be counted as one, Using HashMap is unnecessary???????? Doubt it.
    //Hashmap sorted as value increases so it's disappointing.



    public static String compressString(String text) {
        //string to char array
        char[] charArray = text.toCharArray();
        HashMap<Character, Integer> hashString = new HashMap<>();
        //aaa   bbbbb   cccc
        //char array to hashmap first
        /*for(int i = 0 ; i<charArray.length-1; i++){
            if(hashString.containsKey(charArray[i])){
                int elementCounter = hashString.get(charArray[i]);
                elementCounter++;
                hashString.replace(charArray[i],elementCounter);
            }
            else{
                hashString.put(charArray[i],1);
            }
        }
        //we have mapped char array to hashmap
        //string -> chararray -> hashmap

        for (Map.Entry<Character, Integer> entry: hashString.entrySet()) {
            System.out.println(entry.getKey());
        }*/


        //we can count numbers then save it into linked list, then while we construct it again while there is same char...
        //...it will pass then get array list value. When all done we can just toString()?
        ArrayList<Integer> counterList = new ArrayList<>();
        for (int i = 0 ; i < charArray.length-1; i++){
            int counter=0;
            for(int j = i; j<charArray.length-1; j++){
                if(charArray[i] == charArray[j]){
                    counter++;
                }
                else{
                    i=i+counter-1;
                    counterList.add(counter);
                    break;
                }
            }
        }


        return "";
    }
}
