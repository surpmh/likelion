package _1006.setrandomalphabet;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        Set<Character> alphabets = new HashSet<>();

        while (alphabets.size() != 10) {
            char c = (char) randomAlphabetGenerator.generate();
            alphabets.add(c);
        }

        for (char alphabet : alphabets) {
            System.out.println(alphabet);
        }

        System.out.println("알파벳 개수: " + alphabets.size());
    }
}
