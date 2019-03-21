public class areAllCharsAreUnique {
    public static void main(String[] args) {
        String a = "aaaa";
        System.out.println(areAllCharactersUnique(a));
    }
    public static boolean areAllCharactersUnique(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (i != j) {
                    if (charArray[i] == charArray[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
