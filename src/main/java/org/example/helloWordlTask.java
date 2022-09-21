package org.example;

public class helloWordlTask {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("Hola mundo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
