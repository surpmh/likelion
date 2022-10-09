package codeup.day3.problem1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] arr = num.split("\\.");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}