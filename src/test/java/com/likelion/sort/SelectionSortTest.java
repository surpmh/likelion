package com.likelion.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort() {
        int[] arr = {1, 7, 3, 9, 28, 11};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        int[] sortedArr = {1, 3, 7, 9, 11, 28};

        Assertions.assertEquals(sortedArr[0], arr[0]);
        Assertions.assertEquals(sortedArr[2], arr[2]);
        Assertions.assertEquals(sortedArr[5], arr[5]);

    }
}