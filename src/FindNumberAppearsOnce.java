import java.util.*;

public class FindNumberAppearsOnce {

    public static int singleNumber(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i : A) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                hashMap.put(i, 3);
            }
        }
        for (HashMap.Entry<Integer, Integer> item : hashMap.entrySet()) {
            if (item.getValue() == 1) {
                return item.getKey();
            }
        }

        return 12312;
    }

}
