package exceptions.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {
        readFile("/Users/ankit/Documents/scaler/java-examples/src/exceptions/example1/test1.txt");
    }

    public static void readFile(String filePath) {
        System.out.println("Starting to read file");
        String test = null;


        try {
            File file = new File(test);
            // Breaks the control flow as soon as an exception is thrown
            FileReader fileReader = new FileReader(file);
            System.out.println("Just done with reading a file");
        } catch(FileNotFoundException ex) {
            System.out.println("Got file not found exception. Please check filename");
            // show user en error message
        } catch(IOException ex) {
            System.out.println("Some IOException occurred here");
        }

        // Break: 8:37 -> 8:45


        // Rule: Most of the time, catch specific exceptions
        // Rule: In multiple catch blocks, use child exception before using parent exception


        System.out.println("File read done");
    }
}
