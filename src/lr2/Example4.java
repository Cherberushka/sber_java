package lr2;

import java.util.Scanner; // пакет для подключения класса Scanner

public class Example4 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого в консоль
        Scanner in = new Scanner(System.in);
        // Запись в переменную rows (определяет количество строк массива)
        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();
        // Запись в переменную cols (определяет количество столбцов массива)
        System.out.print("Введите количество столбцов: ");
        int cols = in.nextInt();
        // Создание массива с размерами введённым из консоли
        int[][] arr = new int[rows][cols];
        // Переменная счетчика для заполнения массива
        int c = 1;

        // Заполнение массива в виде змеиного узора
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {                           // Заполняемый ряд слева направо
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = c;
                    c++;
                }
            } else {                                    // Заполнение ряда справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    arr[i][j] = c;
                    c++;
                }
            }
        }

        // Вывод массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
