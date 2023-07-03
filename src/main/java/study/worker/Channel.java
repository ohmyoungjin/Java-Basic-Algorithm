package main.java.study.worker;

public class Channel {

    private static final int MAX_REQUEST = 100; //thread 개수
    private final Request[] requestsQueue;
    private int tail; //다음에 putRequest 하는 장소
    private int head; //다음에 TakeRequest 하는 장소
    private int count; //Request 수

    private final WorkerThread[] threadPool;

    public Channel(int thread) {
        this.requestsQueue = new Request[MAX_REQUEST];
        this.tail = 0;
        this.head = 0;
        this.count = 0;
        this.threadPool = new WorkerThread[thread];
        for(int i=0; i< threadPool.length; i++) {
            threadPool[i] = new WorkerThread("Worker-"+i, this);
        }
    }

    public void startWorker() {
        for (int i=0; i< threadPool.length; i++) {
            threadPool[i].start();
        }
    }

    public synchronized void putRequest(Request request) {
        while(count >= requestsQueue.length) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        requestsQueue[tail] = request;
        tail = (tail + 1) % requestsQueue.length;
        count++;
        notifyAll();
    }

    public synchronized Request takeRequest() {
        while(count <= 0) {
            try {
                wait();
            } catch(InterruptedException e) {
            }
        }
        Request request = requestsQueue[head];
        head = (head + 1) % requestsQueue.length;
        count--;
        notifyAll();
        return request;
    }
}
