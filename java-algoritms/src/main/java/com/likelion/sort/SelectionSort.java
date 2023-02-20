package com.likelion.sort;

interface StatementStrategy {
    boolean apply(int a, int b);
}

public class SelectionSort {
    public int[] sort(int arr[], StatementStrategy stmt) {
        for (int i = 0; i < arr.length; i ++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }
}
