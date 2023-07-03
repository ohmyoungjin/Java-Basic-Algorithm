package main.java.study.worker;

import java.util.Random;

public class ClientThread extends Thread{

    private final Channel channel;

    private static final Random random = new Random();

    /**
     * 생성자로 사용할 Thread 지정
     * @param name
     * @param channel
     */
    public ClientThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    /**
     * task run function
     */
    public void run() {
        try {
            for (int i=0; true; i++) {
                Request request = new Request(getName(), i);
                channel.putRequest(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {

        }
    }

}
