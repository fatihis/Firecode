import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IsIsomorphicTestClass {
    @Test
    void isIsomorpicTest(){
        String str1 = "css";
        String str2 = "dll";
        String str4 = "xyzxyz";
        String str3 = "abcabc";
        assertEquals(true,IsIsomorphic.isIsomorphic(str1,str2));
        assertEquals(true,IsIsomorphic.isIsomorphic(str3,str4));
    }

}
