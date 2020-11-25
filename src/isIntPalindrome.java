public class isIntPalindrome {
    public static Boolean isIntPalindrome(int x) {
        if(x < 0 ){
            return false;
        }
        if(0 < x && x < 10){
            return true;
        }
        Integer.reverse(x);
        int length = String.valueOf(x).length();
        int j = length-1;
        String xStr = String.valueOf(x);
        for(int i = 0; i<length/2;   i++,j--){
            if(xStr.charAt(i) != xStr.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
