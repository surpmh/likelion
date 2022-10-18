package _1018;

import java.util.Scanner;

public class Triangle {
    public void printTriangle(int n, int i) {
        if (n < i) {
            return;
        }
        System.out.println("*".repeat(i));
        printTriangle(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle triangle = new Triangle();
        triangle.printTriangle(n, 1);
    }
}
