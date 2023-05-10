package lr3.equal_collections;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTiming {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        // Заполняем список 12000000 случайными числами
        for (int i = 0; i < 12000000; i++) {
            list.add(rand.nextInt());
        }

        // Измеряем время добавления элемента в начало списка
        long startTime = System.nanoTime();
        list.add(0, rand.nextInt());
        long endTime = System.nanoTime();
        System.out.println("Добавление элемента в начало: " + (endTime - startTime) + " наносекунд");

        // Измеряем время добавления элемента в конец списка
        startTime = System.nanoTime();
        list.add(rand.nextInt());
        endTime = System.nanoTime();
        System.out.println("Добавление элемента в конец: " + (endTime - startTime) + " наносекунд");

        // Измеряем время добавления элемента в середину списка
        startTime = System.nanoTime();
        list.add(list.size()/2, rand.nextInt());
        endTime = System.nanoTime();
        System.out.println("Добавление элемента в середину: " + (endTime - startTime) + " наносекунд");

        // Измеряем время удаления элемента из начала списка
        startTime = System.nanoTime();
        list.remove(0);
        endTime = System.nanoTime();
        System.out.println("Удаление элемента из начала: " + (endTime - startTime) + " наносекунд");

        // Измеряем время удаления элемента из конца списка
        startTime = System.nanoTime();
        list.remove(list.size()-1);
        endTime = System.nanoTime();
        System.out.println("Удаление элемента из конца: " + (endTime - startTime) + " наносекунд");

        // Измеряем время удаления элемента из середины списка
        startTime = System.nanoTime();
        list.remove(list.size()/2);
        endTime = System.nanoTime();
        System.out.println("Удаление элемента из середины: " + (endTime - startTime) + " наносекунд");

        // Измеряем время выборки элементов по случайным индексам
        startTime = System.nanoTime();
        for (long i = 0; i < 120000000L; i++) {
            int index = rand.nextInt(list.size());
            int element = list.get(index);
        }
        endTime = System.nanoTime();
        System.out.println("Время выполнения операции выборки элементов по индексу: " + (endTime - startTime) + " наносекунд");
    }
}
