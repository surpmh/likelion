package _1005.randomcalculator;

public class RandomNumberCreator implements NumberCreator {
    @Override
    public int make() {
        return (int)(Math.random() * 10);
    }
}
