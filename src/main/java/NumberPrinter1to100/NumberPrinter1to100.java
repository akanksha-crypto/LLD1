package NumberPrinter1to100;

public class NumberPrinter1to100 implements Runnable{
    private int x;
    public NumberPrinter1to100(int x){
        this.x = x;
    }
    public  void run(){
        System.out.println("Print number : " + this.x + " with help of " + Thread.currentThread().getName());
    }
}
