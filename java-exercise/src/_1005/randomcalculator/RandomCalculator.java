package _1005.randomcalculator;

public class RandomCalculator {
    private int a;
    private int numberCreator;

    public RandomCalculator(int a, NumberCreator numberCreator) {
        this.a = a;
        this.numberCreator = numberCreator.make();
    }

    public void randomNum() {
        System.out.println("랜덤 숫자: " + numberCreator);
    }

    public void plus() { System.out.println(a + this.numberCreator); }

    public void minus() {
        System.out.println(a - this.numberCreator);
    }

    public void multiple() {
        System.out.println(a * this.numberCreator);
    }

    public void divide() {
        if (this.numberCreator == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println((double) a / this.numberCreator);
        }

    }

}
