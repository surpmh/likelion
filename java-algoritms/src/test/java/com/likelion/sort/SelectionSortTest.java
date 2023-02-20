package com.likelion.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort() {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort = new SelectionSort();

        selectionSort.sort(arr, (a, b) -> a > b);
        Assertions.assertEquals(2, arr[0]);
        Assertions.assertEquals(3, arr[1]);
        Assertions.assertEquals(4, arr[2]);

        selectionSort.sort(arr, (a, b) -> a < b);
        Assertions.assertEquals(223, arr[0]);
        Assertions.assertEquals(111, arr[1]);
        Assertions.assertEquals(39, arr[2]);
    }
}