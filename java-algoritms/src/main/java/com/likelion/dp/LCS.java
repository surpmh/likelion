package com.likelion.dp;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC";  // 행
        int answer = 0;

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i=0; i<=str2.length(); i++) {
            for (int j=0; j<=str1.length(); j++) {
//                System.out.printf("i:%s j:%s\n", str2.charAt(i), str1.charAt(j));
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (str2.charAt(i-1) == str1.charAt(j-1)) {
                    // 두 개가 같으면 대각선에서 1을 더해준다.
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    // 두 개가 다르면 위쪽과 왼쪽 중 큰값을 가져온다.
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
//                System.out.print(dp[i][j]);
                answer = Math.max(answer, dp[i][j]);
            }
//            System.out.println();
        }
        System.out.println("답: " + answer);
    }
}