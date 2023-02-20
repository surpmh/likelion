package com.likelion.recursion;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static int sum(List<Integer> nums) {
        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size() - 1) + sum(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        System.out.println(sum(nums));
    }
}
