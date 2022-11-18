package com.likelion.programmers;

public class Caesar {
    public String solution(String s, int n) {
        int ch;
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                answer += " ";
                continue;
            }

            ch = s.charAt(i) + n;

            if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
                if (90 < ch) {
                    ch -= 26;
                }
            } else {
                if (122 < ch) {
                    ch -= 26;
                }
            }

            answer += (char)ch;
        }
        return answer;
    }
}