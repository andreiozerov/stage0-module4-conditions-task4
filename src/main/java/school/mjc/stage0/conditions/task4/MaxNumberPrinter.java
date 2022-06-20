package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int comparisonFirstTwo = (first > second) ? first : second;
        int result = (comparisonFirstTwo > third) ? comparisonFirstTwo : third;
        System.out.println(result);
    }
}
