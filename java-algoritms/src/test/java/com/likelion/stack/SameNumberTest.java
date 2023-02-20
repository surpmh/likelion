package com.likelion.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SameNumberTest {

    @Test
    void solution() {
        HateSameNumberStack sn = new HateSameNumberStack();
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = sn.solution(arr);

        Assertions.assertEquals(answer[0], 1);
        Assertions.assertEquals(answer[1], 3);
        Assertions.assertEquals(answer[2], 0);
        Assertions.assertEquals(answer[3], 1);
    }
}