package iterableanditerator2;

import java.util.*;
import java.util.function.BiFunction;

public class ShoppingCart implements Iterable<Product> {
    private List<Product> productList = new ArrayList<>();

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(productList);
    }

    public void addProduct(String name) {
        productList.add(new Product(name));
    }
}
