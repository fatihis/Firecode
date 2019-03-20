import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @org.junit.jupiter.api.Test
    void testBubbleSortArray1() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortArray(arr);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, arr, "arrays are not equal");
    }

    @org.junit.jupiter.api.Test
    void testBubbleSortArray2() {
        int[] arr = {};
        BubbleSort.bubbleSortArray(arr);
        int[] expect = {};
        assertArrayEquals(expect, arr, "null point exception");

    }

    @org.junit.jupiter.api.Test
    void testBubbleSortArray3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        BubbleSort.bubbleSortArray(arr);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, arr);
    }

    @org.junit.jupiter.api.Test
    void testBubbleSortArray4() {
        int[] arr = {0, 0, 0, 0, 0};
        BubbleSort.bubbleSortArray(arr);
        int[] expec = {0, 0, 0, 0, 0};
        assertArrayEquals(expec, arr);
    }

}