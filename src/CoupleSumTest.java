import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CoupleSumTest {
    @Test
    void coupleSumTest(){
        int[] tArray = {2,3};
        int[] inputArray = {1,2,5};

        assertArrayEquals(tArray,CoupleSum.coupleSum(inputArray,7));
    }
}
