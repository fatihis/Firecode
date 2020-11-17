import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    public static boolean isIsomorphic(String input1, String input2) {
        HashMap<Character,Integer> inputOneHashMap = new HashMap<>();
        char[] inputOneCharArray = input1.toCharArray();
        HashMap<Character,Integer> inputTwoHashMap = new HashMap<>();
        char[] inputTwoCharArray = input2.toCharArray();
        //first string process
        for (char c : inputOneCharArray) {
            if (inputOneHashMap.containsKey(c)) {
                int countOfElement = inputOneHashMap.get(c);
                countOfElement++;
                inputOneHashMap.replace(c, countOfElement);
            } else {
                inputOneHashMap.put(c, 1);
            }
        }
        for (char c : inputOneCharArray) {
            if (inputOneHashMap.containsKey(c)) {
                int countOfElement = inputOneHashMap.get(c);
                countOfElement++;
                inputOneHashMap.replace(c, countOfElement);
            } else {
                inputOneHashMap.put(c, 1);
            }
        }
        //second string process
        for (char c : inputTwoCharArray) {
            if (inputTwoHashMap.containsKey(c)) {
                int countOfElement = inputTwoHashMap.get(c);
                countOfElement++;
                inputTwoHashMap.replace(c, countOfElement);
            } else {
                inputTwoHashMap.put(c, 1);
            }
        }
        for (char c : inputTwoCharArray) {
            if (inputTwoHashMap.containsKey(c)) {
                int countOfElement = inputTwoHashMap.get(c);
                countOfElement++;
                inputTwoHashMap.replace(c, countOfElement);
            } else {
                inputTwoHashMap.put(c, 1);
            }
        }
        //third fase (isomorpism test)
        if(inputOneHashMap.size() != inputTwoHashMap.size()){
            return false;
        }
        ArrayList<Integer> valueSetStr1 = new ArrayList<>();
        ArrayList<Integer> valueSetStr2 = new ArrayList<>();
        for (Map.Entry<Character , Integer> entry : inputOneHashMap.entrySet() ) {
            valueSetStr1.add(entry.getValue());
        }
        for (Map.Entry<Character , Integer> entry : inputTwoHashMap.entrySet() ) {
            valueSetStr2.add(entry.getValue());
        }

        for(int i = 0 ; i<valueSetStr1.size();i++){
            if(!valueSetStr1.get(i).equals(valueSetStr2.get(i))){
                return false;
            }
        }


        return true;
    }
}
