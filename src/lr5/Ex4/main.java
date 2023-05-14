package lr5.Ex4;

public class main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new PrintNumber(i));
            thread.start();
        }
    }

    static class PrintNumber implements Runnable {
        private int number;

        public PrintNumber(int number) {
            this.number = number;
        }

        public void run() {
            System.out.println("Поток " + number);
        }
    }
}
