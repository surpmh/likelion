package codeup.day4.problem1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int x = Integer.parseInt(num, 16);
        System.out.printf("%o", x);
    }
}