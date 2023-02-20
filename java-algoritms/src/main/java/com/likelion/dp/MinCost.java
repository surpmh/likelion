package com.likelion.dp;

import java.util.Arrays;

public class MinCost {
    public static int getMinCost(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = matrix[i][j];
                } else if (i == 0 && j > 0) {
                    dp[i][j] = matrix[i][j-1] + matrix[i][j];
                } else if (i > 0 && j == 0) {
                    dp[i][j] = matrix[i-1][j] + matrix[i][j];
                } else if (i > 0 && j > 0) {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + matrix[i][j];
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};

        System.out.println(getMinCost(matrix));
    }
}
