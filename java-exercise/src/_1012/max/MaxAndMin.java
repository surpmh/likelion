package _1012.max;

interface Compare {
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {
    private int getMaxOrMin(int[] arr, Compare compare) {
        int targetValue = arr[0];
        for (int i=1; i<arr.length; i++) {
            boolean isSth = compare.doSomething(arr[i], targetValue);
            if (isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        MaxAndMin maxAndMin = new MaxAndMin();
        System.out.println(maxAndMin.max(arr));
        System.out.println(maxAndMin.min(arr));
    }

}
