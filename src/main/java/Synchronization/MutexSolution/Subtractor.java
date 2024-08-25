package Synchronization.MutexSolution;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    Counter c2;
    Lock lock;
    public Subtractor(Counter c2, Lock lock){
        this.c2 = c2;
        this.lock = lock;
    }
    public void run(){
        for(int i=1;i<=100000;i++){
            lock.lock();
            c2.val-=i;
            lock.unlock();
        }
    }
    /*public Integer call(){
        for(int i=1;i<=100000;i++){
            c2.val-=i;
        }
        return c2.val;
    }*/
}
