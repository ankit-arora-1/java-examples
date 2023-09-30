package exceptions.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("/Users/ankit/Documents/scaler/java-examples/src/exceptions/example1/test.txt");
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Starting to read file");
        File file = new File(filePath);

        // Breaks the control flow as soon as an exception is thrown
        FileReader fileReader = new FileReader(file);

        System.out.println("File read done");
    }
}