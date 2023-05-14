package lr4.Ex2.Task_3;

//Для вычисления суммы элементов типа byte одномерного массива, вводимого с клавиатуры, можно использовать следующий код на языке Java:

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            byte[] arr = new byte[size];

            int sum = 0;
            System.out.println("\n");
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i+1) + ": ");
                arr[i] = scanner.nextByte();
                sum += arr[i];
            }

            System.out.println("\n");
            System.out.println("Сумма элементов массива: " + sum);
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: введен отрицательный размер массива");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Bведено не число || Находится вне диапазона принимаемых byte значений от -128 до 127");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: переполнение при вычислении суммы");
        }
    }
}


