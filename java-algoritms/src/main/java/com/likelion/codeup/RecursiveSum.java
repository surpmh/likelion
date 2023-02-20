package com.likelion.codeup;

import java.util.Scanner;

public class RecursiveSum {
    public static int sumNum(int n) {
        if (n <= 0) {
            return n;
        }
        return sumNum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumNum(n));
    }
}
