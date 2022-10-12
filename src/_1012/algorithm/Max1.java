package _1012.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;

        for (int i = 0; i<9; i++) {
            arr.add(sc.nextInt());
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }

        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}
