package lr4.Ex2.Task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 0;
        try {
            System.out.print("Введите размерность массива: ");
            size = in.nextInt();

            if (size <= 0) {
                throw new Exception("Размерность массива должна быть положительным числом!");
            }

        }  catch (InputMismatchException e) {
            System.out.println("Ошибка: Неверный тип данных - " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        int[] array = new int[size];


        // ввод элементов массива
        for (int i = 0; i < size; i++) {
            try {
                System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
                array[i] = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не число. Попробуйте еще раз.");
                in.next(); // очистка буфера сканнера от ошибочного значения
                i--; // повторяем ввод для этого же элемента
            }
        }

        // вычисление среднего значения положительных элементов массива
        int sum = 0;
        int count = 0;
        for (int element : array) {
            if (element > 0) {
                sum += element;
                count++;
            }
        }

        try {
            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов массива: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: массив не содержит положительных элементов.");
        }
    }
}
