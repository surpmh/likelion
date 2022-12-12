package com.likelion.dp;

import java.util.Arrays;

public class MinCost {
    public static int getMinCost(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i=0; i<dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};

        System.out.println(getMinCost(matrix));
    }
}
