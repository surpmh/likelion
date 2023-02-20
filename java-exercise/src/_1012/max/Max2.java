package _1012.max;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int[] maxidx = new int[2];

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxidx[0] = i+1;
                    maxidx[1] = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxidx[0] + " " + maxidx[1]);
    }
}
