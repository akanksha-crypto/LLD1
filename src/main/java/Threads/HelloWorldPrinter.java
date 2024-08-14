package Threads;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Welcome to Hello world!!" + Thread.currentThread().getName());
    }
}
