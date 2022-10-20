package codeup.day9.problem1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%.2f MB", (w * h * b) / 8388608.0);
    }
}