package lambdas;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args)  {
        Thread t2 = new Thread(new Printer());
        Thread thread = new Thread(() -> {
            System.out.println("This is getting printed from another thread");
        });


        //thread.start();
    }
}
