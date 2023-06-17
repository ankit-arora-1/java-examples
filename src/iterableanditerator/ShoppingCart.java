package iterableanditerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product> {
    private List<Product> productList = new ArrayList<>();


    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public class ProductIterator implements Iterator<Product> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < productList.size();
        }

        @Override
        public Product next() {
            Product product = productList.get(cursor);
            cursor += 1;

            return product;
        }
    }
}
