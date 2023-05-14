package lr5.Ex1;

import java.util.Date;

public class main {

    public static void main(String[] args) {

        Thread firstThread = new Thread(new MyRunnable("Первый поток"));
        Thread secondThread = new Thread(new MyRunnable("Второй поток"));

        firstThread.start();
        secondThread.start();

        try {
            Thread.sleep(10000); // ждем 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        firstThread.interrupt();
        secondThread.interrupt();
    }

    public static class MyRunnable implements Runnable {

        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(name + ": " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
