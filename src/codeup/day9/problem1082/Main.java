package codeup.day9.problem1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int num = Integer.parseInt(input, 16);
        for(int i =1; i<16; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num*i);
        }
    }
}