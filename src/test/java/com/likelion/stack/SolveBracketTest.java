package com.likelion.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void solution() {
        SolveBracket sb = new SolveBracket();
        SolveBracketStack sbs = new SolveBracketStack();

        assertTrue(sb.solution1("(())()"));
        assertFalse(sb.solution1(")()("));
        assertTrue(sb.solution2("(())()"));
        assertFalse(sb.solution2(")()("));
        assertTrue(sbs.solution("(())()"));
        assertFalse(sbs.solution(")()("));
    }
}