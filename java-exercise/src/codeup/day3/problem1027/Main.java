package codeup.day3.problem1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] arr = date.split("\\.");
        System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]);
    }
}