import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class maximumGainTestClass {
    @Test
    void maxGainTest(){
        int[] arr = {0,50,10,100,30};

        assertEquals(100,maximumGain.maxGain(arr));
    }
}
