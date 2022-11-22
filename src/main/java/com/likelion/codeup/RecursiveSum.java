package com.likelion.codeup;

import java.util.Scanner;

public class RecursiveSum {
    public int sumNum(int n) {
        if (n <= 0) {
            return n;
        }
        return sumNum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RecursiveSum rs = new RecursiveSum();
        System.out.println(rs.sumNum(n));
    }
}
