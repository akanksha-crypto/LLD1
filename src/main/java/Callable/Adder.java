package Callable;
import Synchronization.SynchronizationProblem.Counter;

import java.util.concurrent.Callable;
public class Adder implements Callable<Integer>{
    public Integer call(){
        int num = 0;
        for(int i=1;i<=10;i++){
            num+=i;
        }
        return num;
    }
}
