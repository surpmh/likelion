package codeup.day3.problem1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] arr = time.split(":");
        System.out.format("%d", Integer.parseInt(arr[1]));
    }
}