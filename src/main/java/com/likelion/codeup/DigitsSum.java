package com.likelion.codeup;

import java.util.Scanner;

public class DigitsSum {
    public Long digit(Long n) {
        if (n <= 0) {
            return n;
        }
        return digit(n / 10) + n % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();

        DigitsSum ds = new DigitsSum();
        System.out.println(ds.digit(n));
    }
}
