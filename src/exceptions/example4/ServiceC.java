package exceptions.example4;

import java.io.FileNotFoundException;

public class ServiceC {
    public void getFromC() throws FileNotFoundException {
        System.out.println("Printing from class C");
        throw new FileNotFoundException("File not found");
    }
}
