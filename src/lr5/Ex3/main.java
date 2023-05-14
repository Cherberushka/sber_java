package lr5.Ex3;

public class main {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new PrintEven());
        Thread oddThread = new Thread(new PrintOdd());
        evenThread.start();
        oddThread.start();
    }

    static class PrintEven implements Runnable {
        public void run() {
            for (int i = 2; i <= 10; i += 2)
                System.out.println("Поток для Нечетных: " + i);
        }
    }

    static class PrintOdd implements Runnable {
        public void run() {
            for (int i = 1; i <= 9; i += 2)
                System.out.println("Поток для Четных: " + i);
        }
    }
}
