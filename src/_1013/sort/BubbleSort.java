package _1013.sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 3, 9, 28, 11};
        BubbleSort  bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
