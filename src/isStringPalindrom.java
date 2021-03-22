public class isStringPalindrom {
    public static boolean isStringPalindrome(String str){
        char[] strCharArray = str.toCharArray();
            if(str == null || str == ""){
                return true;
            }
        for (int i = 0; i < strCharArray.length/2 ; i++){
            if(strCharArray[i] != strCharArray[strCharArray.length-i-1]){
                return false;
            }
        }


    return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("adaa"));
    }
}
