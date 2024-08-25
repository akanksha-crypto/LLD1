package Synchronization.MutexSolution;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter c1;
    Lock lock;
    public Adder(Counter c1, Lock lock){
        this.c1 = c1;
        this.lock = lock;
    }
    public void run(){
        for(int i=1;i<=100000;i++){
            lock.lock();
            c1.val+=i;
            lock.unlock();
        }
    }
  /* public Integer call(){
       for(int i=1;i<=100000;i++){
           c1.val+=i;
       }
       return c1.val;
   }*/
}
