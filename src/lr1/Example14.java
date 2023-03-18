package lr1;

import java.util.Scanner;


public class Example14 {

    public static int pow(int value, int powValue) {
        return (int) Math.pow(value, powValue);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        int kv_sum1 = pow(2 * num, 2);

        System.out.printf("%d.%d.%d.%d", num-1, num, num+1,kv_sum1);
    }

}
