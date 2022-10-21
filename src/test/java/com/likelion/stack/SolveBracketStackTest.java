package com.likelion.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketStackTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void solution() {
        SolveBracket sb = new SolveBracket();

        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
    }
}