package _1004.evenodd;

import java.util.Scanner;

public class EvenOddPlus {
    public static String getEvenOdd(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }

    public static void printEvenOddStatement(int first, int second) {
        System.out.printf("%s+%s=%s", getEvenOdd(first), getEvenOdd(second), getEvenOdd(first+second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        printEvenOddStatement(first, second);
    }
}