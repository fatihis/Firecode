import java.util.ArrayList;

public class ReverseInt {

    public static int reverseInt(int x) {
        char[] charArray = String.valueOf(x).toCharArray();
        ArrayList<Character> newIntegerCharArray = new ArrayList<>();
        boolean flag = false;
        for (int i = charArray.length-1 ; i >= 0 ; i--) {
            newIntegerCharArray.add(charArray[i]);
        }
        if(newIntegerCharArray.get(newIntegerCharArray.size()-1) == '-'){
            newIntegerCharArray.remove(newIntegerCharArray.size()-1);
            flag = true;
        }
        String newIntStr = "";
        for (char c:newIntegerCharArray) {
            if(c != ' '){
                newIntStr += c;
            }
        }
        if(flag == true){
            newIntStr = "-" + newIntStr;
        }

        int newInt = Integer.parseInt(newIntStr);

        return newInt;
    }

    public static void main(String[] args) {

        System.out.println(reverseInt(-1231314141));
    }
}

