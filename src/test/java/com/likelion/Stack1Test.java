package com.likelion;

import com.likelion.stack.Stack1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Stack1Test {
    @Test
    void pushTest() {
        Stack1 stack = new Stack1(10);
        stack.push(10);
        stack.push(20);

        int[] arr = stack.getArr();

        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }

    @Test
    void popTest() {
        Stack1 stack = new Stack1(10);
        stack.push(10);
        stack.push(20);

        Assertions.assertEquals(20, stack.pop());
    }
}