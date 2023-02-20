package _1018;

import java.util.Scanner;

public class Triangle {
    public void printStar(int cnt) {
        if (cnt <=0) {
            return;
        }
        System.out.print("*");

        printStar(cnt-1);
    }
    public void printTriangle(int n, int i) {
        if (n < i) {
            return;
        }
        Triangle triangle = new Triangle();
        triangle.printStar(i);
        System.out.println();
        printTriangle(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle triangle = new Triangle();
        triangle.printTriangle(n, 1);
    }
}
