package Synchronization.SnchronizedKeyword;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Client{
    public  static void main(String args[]) throws ExecutionException, InterruptedException {
        Counter counter = new Counter();
        counter.val = 10;
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
    //    Future<Integer> future = executorService.submit(adder);
    //    Future<Integer> future1 = executorService.submit(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.val);
    }
}