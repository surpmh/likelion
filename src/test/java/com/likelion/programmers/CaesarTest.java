package com.likelion.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void solution() {
        Caesar caesar = new Caesar();

        Assertions.assertEquals("BC", caesar.solution("AB", 1));
        Assertions.assertEquals("a", caesar.solution("z", 1));
        Assertions.assertEquals("e F d", caesar.solution("a B z", 4));
    }
}