package timus.task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLilly = 2;

        try {

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName));
            String redLine = "";

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((redLine  = bufferedReader.readLine()) != null){
                if (numberOfFriends == 0){
                    numberOfFriends = Integer.parseInt(redLine);
                    continue;
                }
                if (redLine.contains("+")){
                    numberOfPairs++;
                }
            }

            int result;

            int guests = (marshalAndLilly + numberOfFriends + numberOfPairs);

            if (guests == 13){
                result = (guests * 100) + 100;
            } else {
                result = guests * 100;
            }


            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
