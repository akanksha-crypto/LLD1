package Synchronization.SynchronizationProblem;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Integer> {
    Counter c2;
    public Subtractor(Counter c2){

        this.c2 = c2;
    }
   /* public void run(){
        for(int i=1;i<=100000000;i++){
            c2.val-=i;
        }
    }*/
    public Integer call(){
        for(int i=1;i<=100000;i++){
            c2.val-=i;
        }
        return c2.val;
    }
}
