package com.likelion.stack;

import java.util.*;

public class SameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            if (stack.isEmpty() || stack.peek() != n) {
                stack.push(n);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i=stack.size()-1; i>=0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
