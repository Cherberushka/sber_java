package timus.task_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        double a = Double.parseDouble(input.split(" ")[0]);
        double b = Double.parseDouble(input.split(" ")[1]);

        System.out.printf("%.9f", ((a + b) * (a + b) + 2 * (Math.sqrt(2) - 1) * a * b) / 4);
    }
}

