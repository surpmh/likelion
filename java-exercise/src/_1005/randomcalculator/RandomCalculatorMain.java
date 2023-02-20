package _1005.randomcalculator;

import java.util.Scanner;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        NumberCreator numberCreator = new RandomNumberCreator();
        RandomCalculator cal = new RandomCalculator(a, numberCreator);

        cal.randomNum();
        cal.plus();
        cal.minus();
        cal.multiple();
        cal.divide();
    }
}
