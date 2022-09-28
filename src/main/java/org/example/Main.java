package org.example;

public class Main {
        public static void main(String[] args) {
            Thread helloWorldThread = new Thread(new repeatMessageTask(50, "Hello world", 10));
            Thread goodbyeThread = new Thread(new repeatMessageTask(50, "Goodbye", 20));

            helloWorldThread.start();
            goodbyeThread.start();

            try{
                helloWorldThread.join();
                goodbyeThread.join();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println("Final del programa");
        }
    }