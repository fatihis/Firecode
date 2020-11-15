import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
public class FlipVerticalAxisTestClass {
    
    @Test
    public void flipVerticalAxisTest(){
        int[][] arr = new int[2][2];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[1][0] = 0;
        arr[1][1] = 1;
        int[][] arrTrue = new int[2][2];
        arrTrue[0][0] = 1;
        arrTrue[0][1] = 0;
        arrTrue[1][0] = 1;
        arrTrue[1][1] = 0;

        assertArrayEquals(FlipVerticalAxis.flipItVerticalAxis(arr),arrTrue);
        
    }
    
}
