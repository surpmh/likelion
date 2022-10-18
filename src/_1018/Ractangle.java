package _1018;

import java.util.Scanner;

public class Ractangle {
    public void printRactangle(int w, int h) {
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        Ractangle ractangle = new Ractangle();
        ractangle.printRactangle(w, h);
    }
}
