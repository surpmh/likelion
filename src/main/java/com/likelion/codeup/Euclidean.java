package com.likelion.codeup;

import java.util.Scanner;

public class Euclidean {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }

    public static int euclidean(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) swap(a, b);

        System.out.println(euclidean(a, b));
    }
}