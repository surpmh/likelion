package com.likelion.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void solution() {
        PhoneBook pb = new PhoneBook();
        String[] arr = {"119", "97674223", "1195524421"};
        Assertions.assertFalse(pb.solution(arr));
    }
}