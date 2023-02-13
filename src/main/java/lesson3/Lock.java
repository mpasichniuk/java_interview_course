package lesson3;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {

    public static void main(String[] args) {
        Resource resource = new Resource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread(resource, locker));
            t.setName("Count" + i);
            t.start();
        }
    }
}
