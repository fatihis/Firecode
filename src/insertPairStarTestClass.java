import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class insertPairStarTestClass {
    @Test
    void insertPairStarTest(){
        String s = "ababbaabb";
        String sExpected = "abab*ba*ab*b";
        assertEquals(sExpected,InsertStarPair.insertPairStar(s));
    }
}
