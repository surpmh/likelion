package codeup.day5.problem1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}
