package com.likelion.stack;

import java.util.Arrays;

public class SolveBracket {
    public boolean solution1(String s) {
        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean solution2(String s) {
        while (s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");
            s = String.join("", splitted);
        }

        return s.length() == 0;
    }
}
