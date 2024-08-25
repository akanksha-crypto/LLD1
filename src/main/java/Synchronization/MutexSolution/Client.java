package Synchronization.MutexSolution;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Client{
    public  static void main(String args[]) throws ExecutionException, InterruptedException {
        Counter counter = new Counter();
        counter.val = 10;
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(counter, lock);
        Subtractor subtractor = new Subtractor(counter,lock);
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