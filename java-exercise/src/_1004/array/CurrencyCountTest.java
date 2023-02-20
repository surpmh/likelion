package _1004.array;

public class CurrencyCountTest {
    public static void main(String[] args) {

        int c50000 = 50000;
        int c10000 = 10000;
        int c5000 = 5000;
        int c1000 = 1000;
        int c500 = 500;
        int c100 = 100;
        int c50 = 50;
        int c10 = 10;

        int refund = 25000;

        System.out.printf("5만원권 %d장 나머지%d\n", refund / c50000, refund % c50000);
        refund %= c50000;
        System.out.printf("1만원권 %d장 나머지%d\n", refund / c10000, refund % c10000);
        refund %= c10000;
        System.out.printf("5천원권 %d장 나머지%d\n", refund / c5000, refund % c5000);
        refund %= c5000;
        System.out.printf("1천원권 %d장 나머지%d\n", refund / c1000, refund % c1000);
        refund %= c1000;
        System.out.printf("5백원권 %d장 나머지%d\n", refund / c500, refund % c500);
        refund %= c500;
        System.out.printf("1백원권 %d장 나머지%d\n", refund / c100, refund % c100);
        refund %= c100;
        System.out.printf("5십원권 %d장 나머지%d\n", refund / c50, refund % c50);
        refund %= c50;
        System.out.printf("1십원권 %d장 나머지%d\n", refund / c10, refund % c10);
        refund %= c10;
    }
}
