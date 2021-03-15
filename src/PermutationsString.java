import java.util.HashMap;

public class PermutationsString {

    public static boolean permutation(String str1, String str2) {
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        HashMap<Character, Integer> hashMapStr1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMapStr2 = new HashMap<Character, Integer>();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1CharArray.length; i++) {
                if (hashMapStr1.containsKey(str1CharArray[i])) {
                    hashMapStr1.replace(str1CharArray[i], hashMapStr1.get(str1CharArray[i]) + 1);
                } else {
                    hashMapStr1.put(str1CharArray[i], 1);
                }
                if (hashMapStr2.containsKey(str2CharArray[i])) {
                    hashMapStr2.replace(str2CharArray[i], hashMapStr2.get(str2CharArray[i]) + 1);
                } else {
                    hashMapStr2.put(str2CharArray[i], 1);
                }

            }

            for (Character chr : hashMapStr1.keySet()
            ) {
                if (hashMapStr2.containsKey(chr)) {
                    if (hashMapStr2.get(chr) != hashMapStr2.get(chr)) {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }


        return true;
    }

    public static void main(String[] args) {
        String h1 = "global";
        String h2 = "globla";
        String h3 = "dlobla";
        String h4 = "ldobla";
        String h5 = "gtobla";
        String h6 = "gcobla";

        System.out.println(permutation(h3, h4));
        System.out.println(permutation(h5, h6));


    }
}
