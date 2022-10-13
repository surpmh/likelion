package _1013.sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
