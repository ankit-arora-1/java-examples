package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        // print(list);
        // printSquareMap(list);
        // printEvenNumbersWithFilters(list);
         printSum(list);
    }

    // Question 1
    // Given a list of integers, print each value in it
    public static void print(List<Integer> list) {
        // forEach is a terminal operation. That means, it ends the stream
        list.stream().forEach((val) -> System.out.println(val));
    }

    // Question 2
    // Given a list of integers, print the square of each value
    public static void printSquare(List<Integer> list) {
        list.stream().forEach((val) -> System.out.println(val * val));
    }

    // Question 3
    // Same question as above but don't use the squaring logic in forEach
    public static void printSquareMap(List<Integer> list) {
        // A mapping operation is called an intermediate operation. Which means
        // that it doesn't end the stream but returns another stream.

        // This is called chaining
        // method1 -> method2 -> method3
        // H/W find the difference between stream forEach method and normal forEach method
        list.stream()
                .map((val) -> val * val)
                .forEach((val) -> System.out.println(val));
    }

    // Question 4
    // Print even numbers
    public static void printEvenNumbers(List<Integer> list) {
        list.stream()
                .forEach((val) -> {
                    if(val % 2 == 0) {
                        System.out.println(val);
                    }
                });
    }

    // question 5
    // Same as above but with no logic in forEach
    public static void printEvenNumbersWithFilters(List<Integer> list) {
        list.stream()
                .filter((val) -> val % 2 == 0)
                .forEach((val) -> System.out.println(val));
    }

    // Question 6
    // Find all the even numbers and print their square
    public static void printEvenSquare(List<Integer> list) {
        list.stream()
                .filter((val) -> val % 2 == 0)
                .map((val) -> val * val)
                .forEach((val) -> System.out.println(val));
    }

    // Question 7
    // Given a list of integers, print its sum
    // Special methods called "reducers" that return a single value
    // Example: "reduce" and "collect"
    public static void printSum(List<Integer> list) {
        int sum = list.stream().
                reduce(0,(currentElement, currentSum) -> {
                    return currentElement + currentSum;
                });

        System.out.println(sum);
    }

    // 7 minute break: 8:47 -> 8:54

}
