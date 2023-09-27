package lambdas.example2;

import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        decider("upper").apply("testing");
    }

    public static Function<String, String> decider(String input) {

        if(input.equals("upper")) {
            return (val) -> printUpper(val);
        } else if(input.equals("lower")) {
            return (val) -> printLower(val);
        } else {
            return Client::print;
        }
    }

    public static String printUpper(String text) {
        System.out.println(text.toUpperCase());
        return "fromUpper";
    }

    public static String printLower(String text) {
        System.out.println(text.toLowerCase());
        return "fromLower";
    }

    public static String print(String text) {
        System.out.println(text);
        return "fromNormal";
    }

}
