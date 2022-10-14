package _1014;

import java.util.Arrays;

public class InsertionSort1 {
    public static int[] sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 3, 9, 28, 11};
        InsertionSort1 insertionSort = new InsertionSort1();
        InsertionSort1.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}