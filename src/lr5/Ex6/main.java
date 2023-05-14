package lr5.Ex6;

import java.util.concurrent.ExecutionException;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArraySum arraySummation = new ArraySum(array);
        try {
            int sum = arraySummation.sum();
            System.out.println("Sum of array: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
