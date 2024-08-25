package Callable;

import java.util.concurrent.Callable;

public class PrintStatement implements Callable<String> {
    public String call(){
        return "Callable is a functional interface representing a task that returns a result";
    }
}
