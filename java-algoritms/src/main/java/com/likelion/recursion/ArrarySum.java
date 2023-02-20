package com.likelion.recursion;

public class ArrarySum {
    public static int sum(int[] arr, int idx) {
        if (idx < 0) {
            return 0;
        }
        return sum(arr, idx-1) + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9};

        System.out.println(sum(arr, arr.length-1));
    }
}