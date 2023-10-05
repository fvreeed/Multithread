package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SecondThread secondThread = new SecondThread();
        secondThread.start();

        while (true) {
            System.out.println("Main program works");
            Thread.sleep(1000);
        }
    }

}

class SecondThread extends Thread {
    public void run() {
        while (true) {
            try {
                sleep(5000);
                System.out.println("Asynchronous hello!");
                sleep(5000);
                System.out.println("Asynchronous bye!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}