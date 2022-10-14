package _1014;

import java.util.Arrays;

public class InsertionSort2 {
    public int[] sort(int[] arr, int i) {
        if (i >= arr.length) {
            return arr;
        }

        int key = arr[i];
        int j = i-1;
        while (j>=0 && key < arr[j]) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;

        return sort(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 3, 9, 28, 11};
        InsertionSort2 insertionSort = new InsertionSort2();
        insertionSort.sort(arr, 1);

        System.out.println(Arrays.toString(arr));
    }
}