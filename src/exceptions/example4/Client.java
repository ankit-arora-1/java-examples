package exceptions.example4;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();

        try {
            try {
                serviceA.get();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException();
            } catch (RuntimeException ex) {
                System.out.println("Calling from runtime catch block");
            }
        } catch (RuntimeException ex) {
            System.out.println("Calling from outside runtime catch block");
        }


    }
}
