package lambdas;

public class Printer implements Runnable{
    @Override
    public void run() {
        System.out.println("whatever");
    }
}
