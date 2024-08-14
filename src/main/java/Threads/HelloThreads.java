package Threads;

public class HelloThreads implements Runnable{
    public  void run(){
        System.out.println("Welcome to threads world : " + Thread.currentThread().getName());
    }
}
