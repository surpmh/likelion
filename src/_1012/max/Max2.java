package _1012.max;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);

        Loop:
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (arr[i][j] == max) {
                    System.out.print((i+1) + " " + (j+1));
                    break Loop;
                }
            }
        }
    }
}
