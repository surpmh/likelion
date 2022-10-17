package _1017;

import java.util.Scanner;

public class RightTriangle {

    private String letter = "*";

    public RightTriangle(String letter) {
        this.letter = letter;
    }


    public void star(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자: ");
        String letter = sc.nextLine();
        RightTriangle rightTriangle = new RightTriangle(letter);
        System.out.print("수: ");
        int n = sc.nextInt();
        rightTriangle.star(n);
    }
}
