package exceptions.example4;

import java.io.FileNotFoundException;

public class ServiceA {
    ServiceB serviceB = new ServiceB();
    public void get() throws FileNotFoundException {
        serviceB.getFromB();
    }
}
