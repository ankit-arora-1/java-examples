package comparableandcomparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getEngineCapacity() - o2.getEngineCapacity();
    }
}
