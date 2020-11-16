import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FindMissingNumberTestClass {
    @Test
    void findMissingNumberTest(){
        int[] arr = {2,1,3,6,4,5,9,8};
        int[] arr2 = {7,2,1,3,6,4,9,8};
        int[] arr3 = {2,1,7,6,4,5,9,8};
        int[] arr4 = {7,2,1,3,6,4,5,8};
        assertEquals(7,FindMissingNumber.findMissingNumber(arr));
        assertEquals(5,FindMissingNumber.findMissingNumber(arr2));
        assertEquals(3,FindMissingNumber.findMissingNumber(arr3));
        assertEquals(9,FindMissingNumber.findMissingNumber(arr4));
    }
}
