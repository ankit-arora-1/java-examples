package iterableanditerator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//        for(Integer val: list) {
//            System.out.println(val);
//        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.addProduct("phone");
//        shoppingCart.addProduct("clothes");
//        shoppingCart.addProduct("books");
//
//        for(Product product: shoppingCart) {
//            System.out.println(product.getName());
//        }
//
//
//        Iterator<Product> iterator = shoppingCart.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(execute(add, 1, 2));
    }

    public static int execute(BiFunction<Integer, Integer, Integer> function, int a, int b) {
        return function.apply(a, b);
    }
}
