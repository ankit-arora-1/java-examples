package iterableanditerator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product> {

    private List<Product> products;
    private int cursor = 0;
    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return cursor < products.size();
    }

    @Override
    public Product next() {
        Product product = products.get(cursor);
        cursor += 1;

        return product;
    }
}
