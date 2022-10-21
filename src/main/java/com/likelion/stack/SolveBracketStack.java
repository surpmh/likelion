package com.likelion.stack;

import java.util.Stack;

class SolveBracketStack {
    boolean solution(String s) {
        Stack<String> st = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.add("(");
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}