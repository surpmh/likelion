package com.likelion.knumber;

import java.util.Arrays;

public class KNumArray {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] slicedArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(slicedArr);
            answer[idx++] = slicedArr[command[2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        KNumArray kNumArray = new KNumArray();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(kNumArray.solution(arr, commands)));
    }
}
