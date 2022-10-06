package _1006.setrandomnumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() != 50) {
            int r = randomNumberGenerator.generate(100);
            numbers.add(r);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("숫자 개수: " + numbers.size());
    }
}
