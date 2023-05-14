package lr5.Ex6;

import java.util.concurrent.*;

public class ArraySum {

    private int[] array;
    private int numThreads;

    public ArraySum(int[] arr) {
        array = arr;
        numThreads = Runtime.getRuntime().availableProcessors();
    }

    public int sum() throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(numThreads);
        int size = array.length / numThreads;

        CompletionService<Integer> completionService = new ExecutorCompletionService<>(service);
        for (int i = 0; i < numThreads; i++) {
            final int startIndex = i * size;
            final int endIndex = (i == numThreads - 1) ? array.length : startIndex + size;
            completionService.submit(() -> {
                int sum = 0;
                for (int j = startIndex; j < endIndex; j++) {
                    sum += array[j];
                }
                return sum;
            });
        }

        int sum = 0;
        for (int i = 0; i < numThreads; i++) {
            sum += completionService.take().get();
        }

        service.shutdown();
        return sum;
    }
}