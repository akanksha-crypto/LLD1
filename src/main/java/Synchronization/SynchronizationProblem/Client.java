package Synchronization.SynchronizationProblem;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import  java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Client{
    public  static void main(String args[]) throws ExecutionException, InterruptedException {
        Counter counter = new Counter();
        counter.val = 10;
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);
        ExecutorService executorService =Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(adder);
        Future<Integer> future1 = executorService.submit(subtractor);
        future.get();
        future1.get();
        System.out.println(counter.val);
        executorService.shutdown();
    }
}