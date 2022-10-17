package codeup.day8.problem1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (true) {
            sum += i;
            if (num <= sum) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}