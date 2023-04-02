package lr2;

import java.util.Random;   // пакет для подключения класса Random
import java.util.Scanner;  // пакет для подключения класса Scanner

public class Example3 {
        public static void main(String[] args) {
            // Создание объекта класса Scanner для считывания числа введённого в консоль
            Scanner id = new Scanner(System.in);
            // Сообщения пользователю " для красоты и понимания "
            System.out.println("Введите размер массива:");
            // Запись в переменную Size (определяет размер массива)
            int size = id.nextInt();
            // Создание массива с размер введённым из консоли
            int[] array = new int[size];
            // Создание объекта класса Random для генерации псевдослучайных чисел
            Random rand = new Random();
            // Создадим переменную min и присвоим наибольшее значение типа данных integer
            int min = Integer.MAX_VALUE;

            for(int i=0; i<array.length; i++) {
                // Присвоение i-тому элементу массива случайного значения
                array[i] = rand.nextInt(100);
                // Сообщения пользователю " для красоты и понимания "
                System.out.print(array[i] + " ");
                // Если i-й элемент массива меньшая значения хранящегося в переменной min, то присваеваем min значения i-того элемента массива
                if(array[i] < min) {
                    min = array[i];
                }
            }

            // Сообщения пользователю " для красоты и понимания "
            System.out.println("\nМинимальное значение элемента: " + min);
            System.out.print("Индексы минимальных элементов: ");
            // Создадим цикл который выведет все индексы соответсвующие наименьшему значению массива
            for(int i=0; i<array.length; i++) {
                if(array[i] == min) {
                    System.out.print(i + " ");
                }
            }
        }
}