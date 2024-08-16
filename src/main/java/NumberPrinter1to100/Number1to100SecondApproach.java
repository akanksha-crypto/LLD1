package NumberPrinter1to100;

public class Number1to100SecondApproach implements Runnable{
    private int num = 0;
    public void run(){
        System.out.println("Number printed : "+ num + " via " + Thread.currentThread().getName());
        num++;
    }
}
