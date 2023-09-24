package lambdas;

import comparableandcomparator.Car;
import comparableandcomparator.CarComparator;
import comparableandcomparator.ComparableExample1;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();

        System.out.println(comparator.compare("test", "test2"));

    }
}
