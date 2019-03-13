import java.util.Objects;

public class ReplaceSpaces {


    public static void main(String[] args) {
        String testString = "ıntellij is ready";
        testReplace(testString, "/", "ıntellij/is/ready");
        String testString3 = "intellij not to update";
        testReplace(testString3, "//", "intellij//not//to//update");

        testReplace(null, "//", null);

        testReplace(testString3, null, "intellij not to update");

        testReplace(testString3, "", "intellijnottoupdate");

        testReplace(null, null, null);

        testReplace("", "", "");

    }

    private static void testReplace(String a, String b, String expected) {

        if (Objects.equals(replace(a, b), expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

    public static String replace(String a, String b) {
        if (a == null) {
            return null;
        }
        if (b == null) {
            return a;
        }
        char[] charList = a.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : charList) {
            if (ch == ' ') {
                result.append(b);
            } else {
                result.append(ch);
            }
        }
        return result.toString();

    }
}


