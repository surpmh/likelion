package com.likelion.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAddTest {

    @Test
    void solution() {
        MatrixAdd md = new MatrixAdd();

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = md.solution(arr1, arr2);
        Assertions.assertEquals(4, answer[0][0]);
        Assertions.assertEquals(6, answer[0][1]);
        Assertions.assertEquals(7, answer[1][0]);
        Assertions.assertEquals(9, answer[1][1]);
    }
}