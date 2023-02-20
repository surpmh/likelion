package com.likelion.search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length;
        int answer = -1;

        while (start <= end) {
            int mid = (start + end) / 2 ;
            if (s == arr[mid]) {
                answer = mid +1;
                break;
            } else if (s < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(answer);
    }
}
