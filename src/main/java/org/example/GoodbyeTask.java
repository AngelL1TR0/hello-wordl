package org.example;

public class GoodbyeTask implements Runnable{

    private int times;

    public GoodbyeTask(int times){
        this.times = times;
    }

    @Override
    public void run() {
        for(int i = 0; i < times; i++){
            System.out.println("Goodbye");
            try{
                Thread.sleep(20);
            }
        }
    }
}
