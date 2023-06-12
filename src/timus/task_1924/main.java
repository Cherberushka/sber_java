package timus.task_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        if ((n * (n + 1) / 2) % 2 == 0)
            System.out.println("black");
        else
            System.out.println("grimy");
    }
}
