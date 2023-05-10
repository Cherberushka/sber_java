package lr3.equal_collections;
import java.util.ArrayDeque;
import java.util.Random;

public class ArrayDequeTiming {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Random rand = new Random();


        // Заполнение коллекции
        for (int i = 0; i < 12000000; i++) {
            deque.add(i);
        }


        // Сравнение времени выполнения операции добавления элемента в начало коллекции
        long start = System.nanoTime();
        deque.offerFirst(-1);
        long end = System.nanoTime();
        System.out.println("Время выполнения операции добавления элемента в начало коллекции: " + (end - start) + " наносекунд");


        // Сравнение времени выполнения операции добавления элемента в конец коллекции
        start = System.nanoTime();
        deque.offerLast(12000000);
        end = System.nanoTime();
        System.out.println("Время выполнения операции добавления элемента в конец коллекции: " + (end - start) + " наносекунд");

        // Сравнение времени выполнения операции добавления элемента в середину коллекции
        start = System.nanoTime();
        deque.add(12000000/2);
        end = System.nanoTime();
        System.out.println("Время выполнения операции добавления элемента в середину коллекции: " + (end - start) + " наносекунд");

        // Сравнение времени выполнения операции по удалению элемента в начале коллекции
        start = System.nanoTime();
        deque.pollFirst();
        end = System.nanoTime();
        System.out.println("Время выполнения операции удаления элемента в начале коллекции: " + (end - start) + " наносекунд");

        // Сравнение времени выполнения операции удаления элемента в конце коллекции
        start = System.nanoTime();
        deque.pollLast();
        end = System.nanoTime();
        System.out.println("Время выполнения операции удаления элемента в конце коллекции: " + (end - start) + " наносекунд");

        // Сравнение времени выполнения операции по удалению элемента в середине коллекции
        start = System.nanoTime();
        deque.remove(12000000/2);
        end = System.nanoTime();
        System.out.println("Время выполнения операции удаления элемента в середине коллекции: " + (end - start) + " наносекунд");

//        // Выборка элементов по индексу
//        for (int i = 0; i < 10000; i++) {
//            deque.offerLast(i);
//        }
//        start = System.nanoTime();
//        for (int i = 0; i < 10000; i++) {
//            deque.get(i);
//        }
//        end = System.nanoTime();
//        System.out.println("Время выполнения операции выборки элементов по индексу: " + (end - start) + " наносекунд");


        // выборка элементов по индексу и замер времени
        long k = 120000000L;
        start = System.nanoTime();
        for (long i = 0; i < k; i++) {
            int index = rand.nextInt(deque.size());
            Integer value = deque.stream().skip(index).findFirst().get();
        }
        end = System.nanoTime();

        System.out.println("Время выполнения операции выборки элементов по индексу: " + (start - end) + " наносекунд");

    }
}
