package codeup.day8.problem1079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);
            System.out.println(ch);
            if (ch == 'q') {
                break;
            }
        }
    }
}