package com.likelion.codeup;

import java.util.Scanner;

public class Euclidean {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }

    public static int euclidean(int a, int b) {
        int c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b); swap(a, b);

        System.out.println(euclidean(a, b));
    }
}