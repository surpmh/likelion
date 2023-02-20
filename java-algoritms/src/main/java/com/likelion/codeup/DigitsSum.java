package com.likelion.codeup;

import java.util.Scanner;

public class DigitsSum {
    public static Long digit(Long n) {
        if (n <= 0) {
            return n;
        }
        return digit(n / 10) + n % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();

        System.out.println(digit(n));
    }
}
