package Synchronization.SynchronizationProblem;
import lombok.val;

import java.util.concurrent.Callable;
public class Adder implements Callable<Integer>{
    Counter c1;
    public Adder(Counter c1){

        this.c1 = c1;
    }
   /* public void run(){
        for(int i=1;i<=100000000;i++){
            c1.val+=i;
        }
    }*/
   public Integer call(){
       for(int i=1;i<=100000;i++){
           c1.val+=i;
       }
       return c1.val;
   }
}
