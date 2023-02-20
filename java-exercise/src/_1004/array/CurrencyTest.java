package _1004.array;

import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.print("금액을 넣으세요:[숫자입력]");
        int amount = sc.nextInt();

        for (int money : moneys) {
            int count = amount / money;
            System.out.println(money + "원" + count + "개");

            amount %= money;
        }
    }
}
