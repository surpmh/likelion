package com.likelion.knumber;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KNumQue {
    private int[] arr;

    public int getKthNum(int[] command) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];

        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KNumQue kNumQ = new KNumQue();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(kNumQ.solution(arr, commands)));
    }
}
