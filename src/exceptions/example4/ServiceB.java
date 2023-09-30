package exceptions.example4;

import java.io.FileNotFoundException;

public class ServiceB {
    ServiceC serviceC = new ServiceC();
    public void getFromB() throws FileNotFoundException {
        serviceC.getFromC();
    }
}
