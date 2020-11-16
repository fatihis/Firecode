import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ReverseStringTestClass {
    @Test
    void reverseStringTest(){
        String stringToReverse = "merhabaarkadaşlar";
        String stringShouldBe = "ralşadakraabahrem";

        assertEquals(stringShouldBe,ReverseString.reverseString(stringToReverse));
    }
}
