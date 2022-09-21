package org.example;

public class goodbyeTask implements Runnable{

    private int times;

    public goodbyeTask(int times){
        this.times = times;
    }

    @Override
    public void run() {
        for(int i = 0; i < times; i++){
            System.out.println("Goodbye");
            try{
                Thread.sleep(20);
            } catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}
