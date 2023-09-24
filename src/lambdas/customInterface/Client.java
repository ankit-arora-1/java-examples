package lambdas.customInterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Client {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a + b;
        MathOperation sub = (a,b) -> a - b;
//        System.out.println(add.operate(1,2));


        // System.out.println(doOperation(1,2, add));

        BiFunction<Integer, Integer, Integer> add2 = (a,b) -> a + b;
        System.out.println(doOperation2(1,2,add2));

        BiFunction<Integer, Integer, Integer> random = (a,b) -> {
            System.out.println("Hello world");
            System.out.println("Another operation");
            return 0;
        };

        System.out.println(doOperation2(2,1, random));

    }

    public static int doOperation2(int a, int b,
                                   BiFunction<Integer, Integer, Integer> function) {
        System.out.println("Op1");
        System.out.println("Op2");
        System.out.println("Op2");
        return function.apply(a,b);
    }

    public static int doOperation(int a, int b, MathOperation mathOperation) {
        System.out.println("Op1");
        System.out.println("Op2");
        System.out.println("Op2");
        return mathOperation.operate(a,b);
    }
}
