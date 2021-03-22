import java.util.HashMap;

public class IsAnagram {
    public static boolean isAnagram(String input1, String input2) {
        char[] str1CharArray = input1.toCharArray();
        char[] str2CharArray = input2.toCharArray();
        HashMap<Character, Integer> hashMapStr1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMapStr2 = new HashMap<Character, Integer>();
        if (input1.length() != input2.length()) {
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
            if(hashMapStr1.size() > hashMapStr2.size()){


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
            if(hashMapStr2.size() > hashMapStr1.size()){


                for (Character chr : hashMapStr2.keySet()
                ) {
                    if (hashMapStr1.containsKey(chr)) {
                        if (hashMapStr1.get(chr) != hashMapStr1.get(chr)) {
                            return false;
                        }
                    } else {
                        return false;
                    }

                }
            }
        }


        return true;
    }

    public static void main(String[] args) {
        String str1 = "dll";
        String str2 = "lad";
        System.out.println(isAnagram(str1,str2));

    }
}
