package lambdas;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        // Callable<String> callable = () -> returnStatus();
        Callable<String> callable = CallableExample::returnStatus; // method reference

    }

    public static String returnStatus() {
        System.out.println("Calling from callable");
        return "done";
    }
}
