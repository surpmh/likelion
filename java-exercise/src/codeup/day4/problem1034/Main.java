package codeup.day4.problem1034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int o = Integer.parseInt(num, 8);
        System.out.printf("%d", o);
    }
}