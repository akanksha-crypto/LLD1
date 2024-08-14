package Threads;

public class Client {
    public  static void main(String args[]){
        System.out.println("Current thread : " + Thread.currentThread().getName());
        HelloWorldPrinter hwp =new HelloWorldPrinter();
        Thread t1 = new Thread(hwp);
        t1.start();
        HelloThreads ht = new HelloThreads();
        Thread t2 = new Thread(ht);
        t2.start();
    }
}
