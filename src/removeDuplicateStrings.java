import java.util.*;

public class removeDuplicateStrings {
/*Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words. The returned ArrayList should be lexically alphabetically.

Input: [Hi, Hello, Hey, Hi, Hello, Hey]

Output: [Hello, Hey, Hi]
*/
public static ArrayList<String> removeDuplicates(List<String> input) {
    HashMap<String,Integer> withoutDuplicates = new HashMap<>();
    if(input == null){
        return null;
    }
    for(int i = 0 ; i<input.size()-1 ; i++){
        if(!withoutDuplicates.containsKey(input.get(i))){
            withoutDuplicates.put(input.get(i),1);
        }
    }

    Set<String> keySet = withoutDuplicates.keySet();
    ArrayList<String> withOutDuplicatesArrayList = new ArrayList<>(keySet);

    Collections.sort(withOutDuplicatesArrayList);
    return withOutDuplicatesArrayList;
}

}
