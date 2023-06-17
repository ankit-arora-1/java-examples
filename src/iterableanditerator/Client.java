package iterableanditerator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,6,3,1,7);

//        Iterator<Integer> itr = list.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        for(Integer val: list) {
            System.out.println(val);
        }

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("laptop"));
        shoppingCart.addProduct(new Product("mobile"));
        shoppingCart.addProduct(new Product("soap"));


        Iterator<Product> itr = shoppingCart.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        for(Product product: shoppingCart) {
            System.out.println(product);
        }

    }
}
