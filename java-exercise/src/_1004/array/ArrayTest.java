package _1004.array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args){
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
        }

        System.out.print(Arrays.toString(arr));
    }
}
