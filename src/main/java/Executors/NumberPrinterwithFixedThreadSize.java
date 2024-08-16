package Executors;

public class NumberPrinterwithFixedThreadSize implements Runnable{
    private int num;
    public NumberPrinterwithFixedThreadSize(int num){
        this.num = num;
    }
    public void run(){
        System.out.println("Number : " + num + "printed by " + Thread.currentThread().getName());
    }
}
