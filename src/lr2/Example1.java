package lr2;

import java.util.Arrays;   // пакет для подключения класса Arrays
import java.util.Random;   // пакет для подключения класса Random
import java.util.Scanner;  // пакет для подключения класса Scanner

public class Example1 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого в консоль
        Scanner id = new Scanner(System.in);
        // Сообщения пользователю " для красоты и понимания "
        System.out.println("Введите размер массива:");
        // Запись в переменную Size (определяет размер массива)
        int size = id.nextInt();
        // Создание массива с размер введённым из консоли
        int[] nums = new int[size];
        // Создание объекта класса Random для генерации "случайного" значения
        Random random = new Random();

        for (int i = 0; i < nums.length; i++){
            // Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200);
            // Сообщение польбзователю "для красоты и понимания"
            System.out.println("Элемент массива ["+i+"] " + nums[i]);
        }

        // Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++){
            // Сообщение пользователю "для красоты и понимания"
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}