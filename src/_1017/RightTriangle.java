package _1017;

import java.util.Scanner;

public class RightTriangle {
    public void star(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RightTriangle rightTriangle = new RightTriangle();
        int n = sc.nextInt();
        rightTriangle.star(n);
    }
}
