package NumberPrinter1to100;

public class Client {
    public static void main(String args[]){
        Number1to100SecondApproach obj = new Number1to100SecondApproach();
        for(int i=1;i<=100;i++){
        //    NumberPrinter1to100 num = new NumberPrinter1to100(i);
            Thread t = new Thread(obj);
            t.start();
        }
    }
}
