package org.example;

public class repeatMessageTask implements Runnable{

    private int times;
    private String message;
    private int ttw;

    public repeatMessageTask(int times, String message, int ttw) {
        this.times = times;
        this.message = message;
        this.ttw = ttw;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
            try {
                Thread.sleep(ttw);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
