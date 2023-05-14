package lr5.Ex5;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] array = new int[10000000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Max: " + findMax(array));
    }

    private static int findMax(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors(); // количество ядер процессора
        int chunkSize = array.length / numThreads; // размер части массива

        MaxFinder[] threads = new MaxFinder[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MaxFinder(array, i * chunkSize, (i + 1) * chunkSize);
            threads[i].start();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                max = Math.max(max, threads[i].getMax());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return max;
    }

    static class MaxFinder extends Thread {
        private int[] array;
        private int startIndex;
        private int endIndex;
        private int max = Integer.MIN_VALUE;

        public MaxFinder(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                max = Math.max(max, array[i]);
            }
        }

        public int getMax() {
            return max;
        }
    }
}
