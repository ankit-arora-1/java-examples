package exceptions.example5;

import javax.sql.rowset.serial.SQLInputImpl;
import java.sql.SQLInput;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Calling from try");
            // throw new Exception();
            return;
        } catch (Exception ex) {
            System.out.println("Calling from exception");
        } finally {
            System.out.println("Printing from finally block");
        }

        System.out.println("This won't be printed");

        System.out.println(test());
    }

    public static int test() throws Exception {
        try {
            // Started loader
        } catch (Exception ex) {
            throw new Exception("Finally catch block");
        } finally {
            // Release resources
            // or, stop loader
        }

        //H/W:  try with resource

        return 2;
    }
}
