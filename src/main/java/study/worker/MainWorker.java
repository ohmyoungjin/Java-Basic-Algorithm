package main.java.study.worker;

public class MainWorker {
    public static void main(String args[]) {
        Channel channel = new Channel(5); // 워커 쓰레드 개수
        channel.startWorker();
        new ClientThread("Alice", channel).start();
        new ClientThread("Bobby", channel).start();
        new ClientThread("Chris", channel).start();
    }
}
