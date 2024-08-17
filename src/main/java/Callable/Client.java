package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public  static void main(String args[]) throws ExecutionException, InterruptedException {
        Adder adder = new Adder();
        Subtractor subtractor = new Subtractor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(adder);
        Future<String> future1 = executorService.submit(subtractor);
        System.out.println(future.get());
        System.out.println(future1.get());
        executorService.shutdown();
    }
}
