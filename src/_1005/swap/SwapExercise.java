package _1005.swap;

public class SwapExercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;

        a = b;
        b = temp;

        System.out.printf("a:%d b:%d", a, b);
    }
}