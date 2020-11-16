public class ReverseString {
    public static String reverseString(String str){
        String inputString = str;
        String outputString = null;
        char[] inputCharArray = inputString.toCharArray();
        int lngInput = inputCharArray.length;
        char[] reversedCharArray = new char[lngInput];
        int index = 0;
        for(int i = inputCharArray.length-1; i >-1 ; i--){
            reversedCharArray[index] = inputCharArray[i];
            index++;
        }
        outputString = String.valueOf(reversedCharArray);
        return outputString;
    }
}
