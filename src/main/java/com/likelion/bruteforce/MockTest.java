package com.likelion.bruteforce;

import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] scores = {0, 0, 0};
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                scores[0] += 1;
            }
            if (answers[i] == second[i % second.length]) {
                scores[1] += 1;
            }
            if (answers[i] == third[i % third.length]) {
                scores[2] += 1;
            }
        }

        int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);

        for (int i=0; i<3; i++) {
            if (scores[i] == max) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
