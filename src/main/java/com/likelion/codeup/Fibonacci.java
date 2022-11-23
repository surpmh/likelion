package com.likelion.codeup;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci1(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci1(n-2) + fibonacci1(n-1);
    }

    public static int fibonacci2(int n) {
        int[] arr = new int[n+1];

        if (n <= 1) return n;

        arr[0] = 0;
        arr[1] = 1;
        arr[n] = arr[n - 2] + arr[n - 1];

        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci1(n));
        System.out.println(fibonacci2(n));
    }
}
