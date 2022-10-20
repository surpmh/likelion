package codeup.day9.problem1090;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.println((long) (a * Math.pow(r, n - 1)));
    }
}