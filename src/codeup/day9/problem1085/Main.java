package codeup.day9.problem1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        System.out.printf("%.1f MB", (h * b * c * s) / 8388608.0);
    }
}