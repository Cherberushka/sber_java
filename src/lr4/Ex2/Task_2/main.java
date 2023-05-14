package lr4.Ex2.Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Введите номер столбца (от 1 до " + matrix[0].length + "): ");

        try {
            int column = input.nextInt();

            // Вывод столбца
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][column-1]);
            }

            // Проверка на существование столбца
            if (column < 1 || column > matrix[0].length) {
                throw new Exception("Столбца с таким номером не существует.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Неверный тип данных - " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

    }
}