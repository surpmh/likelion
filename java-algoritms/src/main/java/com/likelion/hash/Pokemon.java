package com.likelion.hash;

import java.util.HashSet;

class Pokemon {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length / 2;
        int answer = 0;

        for (Integer num : nums) {
            set.add(num);
        }

        if (set.size() < len) {
            answer = set.size();
        } else {
            answer = len;
        }

        return answer;
    }
}