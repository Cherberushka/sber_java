package lr6.Ex1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = rand.nextInt();
        }

        System.out.println("Массив arr : ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);

        System.out.println("Массив arrResult : ");
        System.out.println(Arrays.toString(arrResult));

    }

    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}
