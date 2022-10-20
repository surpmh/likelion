package codeup.day9.problem1087;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (sum < num) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}