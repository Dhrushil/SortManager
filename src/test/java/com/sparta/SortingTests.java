package com.sparta;

import com.sparta.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortingTests {

    @BeforeEach
    void setUp() {
    }

    /**
     * Bubble Sort Tests
     *
     * Time Complexity = O(n^2)
     * Space Complexity = O(1)
     *
     * **/

    @Test
    void BubbleSort() {
        Sorter b1 = new BubbleSort();
        int[] WorstCase = {8,7,6,5,4,3,2,1};
        int[] BestCase = {1,2,3,4,5,6,7,8};
        int[] AverageCase = {4,7,3,8,2,1,6,5};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(b1.sortArray(WorstCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(b1.sortArray(BestCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(b1.sortArray(AverageCase)));

    }

    @Test
    void InsertionSort() {
        Sorter i1 = new InsertionSort();
        int[] WorstCase = {8,7,6,5,4,3,2,1};
        int[] BestCase = {1,2,3,4,5,6,7,8};
        int[] AverageCase = {4,7,3,8,2,1,6,5};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(i1.sortArray(WorstCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(i1.sortArray(BestCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(i1.sortArray(AverageCase)));

    }

    @Test
    void MergeSort() {
        Sorter m1 = new MergeSort();
        int[] WorstCase = {8,7,6,5,4,3,2,1};
        int[] BestCase = {1,2,3,4,5,6,7,8};
        int[] AverageCase = {4,7,3,8,2,1,6,5};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(m1.sortArray(WorstCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(m1.sortArray(BestCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(m1.sortArray(AverageCase)));

    }

    @Test
    void TreeSort() {
        Sorter t1 = new TreeSort();
        int[] WorstCase = {8,7,6,5,4,3,2,1};
        int[] BestCase = {1,2,3,4,5,6,7,8};
        int[] AverageCase = {4,7,3,8,2,1,6,5};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(t1.sortArray(WorstCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(t1.sortArray(BestCase)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(t1.sortArray(AverageCase)));

    }
}