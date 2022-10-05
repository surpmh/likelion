package _1005.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int multiple() {
        return a * b;
    }

    public double divide() {
        return (double)a / b;
    }

    public void run() {
        System.out.println(plus());
        System.out.println(minus());
        System.out.println(multiple());
        System.out.println(divide());
    }
}
