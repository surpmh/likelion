package _1017;

import java.util.Scanner;

public class Pyramid {
    public void star(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void oddstar(int n) {
        for (int i=0; i<n; i++) {
            System.out.println(" ".repeat(n-i-1) + "*".repeat(2*i+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pyramid pyramid = new Pyramid();
        int n = sc.nextInt();
        //pyramid.star(n);
        pyramid.oddstar(n);
    }
}
