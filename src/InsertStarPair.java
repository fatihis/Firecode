import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InsertStarPair {

    public static String insertPairStar(String s) {
        if(s == null){
            return null;
        }
        char[] stringOnCharArray = s.toCharArray();
        ArrayList<Character> stringOnList = new ArrayList<>();
        for (char c : stringOnCharArray) {
            stringOnList.add(c);
        }
        for(int i = 0 ; i < stringOnList.size()-1 ; i++){
            if(stringOnList.get(i) == stringOnList.get(i+1)){
                stringOnList.add(i+1,'*');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char chr:
             stringOnList) {
            sb.append(chr);
        }
        return sb.toString();
    }
}
