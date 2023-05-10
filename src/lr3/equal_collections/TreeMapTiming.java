package lr3.equal_collections;

import java.util.Random;
import java.util.TreeMap;

public class TreeMapTiming {
    public static void main(String[] args) {
        final int N = 12000000;

        Random rand = new Random();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Заполняем список 12000000 случайными числами
        for (int i = 0; i < N; i++) {
            map.put(i, rand.nextInt());
        }

        // Измеряем время добавления элемента в начало
        long start = System.nanoTime();
        map.put(0, rand.nextInt());
        long end = System.nanoTime();
        System.out.println("Время добавления элемента в начало: " + (end - start) + " наносекунд");

        // Измеряем время добавления элемента в конец
        map.clear();
        start = System.nanoTime();
        map.put(N, rand.nextInt());
        end = System.nanoTime();
        System.out.println("Время добавления элемента в конец: " + (end - start) + " наносекунд");

        // Измеряем время добавления элемента в середину
        map.clear();
        start = System.nanoTime();
        map.put(N / 2, rand.nextInt());
        end = System.nanoTime();
        System.out.println("Время добавления элемента в середину: " + (end - start) + " наносекунд");

        // Измеряем время удаления элемента c начала
        start = System.nanoTime();
        map.remove(map.firstKey());
        end = System.nanoTime();
        System.out.println("Время удаления элемента c начала: " + (end - start) + " наносекунд");

        // Измеряем время удаления элемента c начала конца
        map.clear();
        for (int i = 0; i < N; i++) {
            map.put(i, rand.nextInt());
        }
        start = System.nanoTime();
        map.remove(map.lastKey());
        end = System.nanoTime();
        System.out.println("Время удаления элемента c конца: " + (end - start) + " наносекунд");

        // Измеряем время удаления элемента из середины
        for (int i = 0; i < N; i++) {
            map.put(i, rand.nextInt());
        }
        start = System.nanoTime();
        map.remove(map.ceilingKey(N / 2));
        end = System.nanoTime();
        System.out.println("Время удаления элемента из середины: " + (end - start) + " наносекунд");

        // Измеряем время выборки элементов по случайным индексам
        map.clear();
        for (int i = 0; i < N; i++) {
            map.put(i, rand.nextInt());
        }
        start = System.nanoTime();
        for (long i = 0; i < 120000000L; i++) {
            int index = rand.nextInt(map.size());
            int element = map.get(index);
        }
        end = System.nanoTime();
//        start = System.nanoTime();
//        for (int i = 0; i < M; i++) {
//            map.get(i);
//        }
//        end = System.nanoTime();
        System.out.println("Выборка 120000000 элементов по индексу: " + (end - start) + " наносекунд");
    }
}
