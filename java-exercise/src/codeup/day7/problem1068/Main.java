package codeup.day7.problem1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch ((int) num / 10) {
            case 10: case 9:
                System.out.println("A");
                break;
            case 8: case 7:
                System.out.println("B");
                break;
            case 6: case 5: case 4:
                System.out.println("C");
                break;
            case 3: case 2: case 1: case 0:
                System.out.println("D");
                break;
        }
    }
}