package codeup.day8.problem1076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        for (int i=97; i<=ch; i++) {
            System.out.print((char)i + " ");
        }
    }
}