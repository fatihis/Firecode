import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FindNumberAppearsOnceTest {
    @Test
    void singleNumber() {
        int[] arr = {1,2,3,3,2,1,7,8,8};
        assertEquals(7,FindNumberAppearsOnce.singleNumber(arr));
        int[] arr2 = {1,2,3,4,1,2,4,3,5};
        assertEquals(5,FindNumberAppearsOnce.singleNumber(arr2));
        int[] arr3 = {1,1,1,4,5,6,7,7,6,4};
        assertEquals(5,FindNumberAppearsOnce.singleNumber(arr3));

    }


}