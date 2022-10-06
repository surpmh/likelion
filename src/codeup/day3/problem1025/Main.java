package codeup.day3.problem1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        for (int i=0; i<num.length(); i++) {
            System.out.print("[" + num.charAt(i));
            for (int j= num.length()-1; j > i; j--) {
                System.out.print("0");
            }
            System.out.println("]");
        }

    }
}