package comparableandcomparator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparableExample1 {
    public static void main(String[] args) {
        Car car1 = new Car(100, 50);
        Car car2 = new Car(200, 50);

        System.out.println(car1.compareTo(car2));

//        PriorityQueue<Car> pQ = new PriorityQueue<>(new CarComparator());
        PriorityQueue<Car> pQ = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        });
        pQ.add(new Car(100, 50));
        pQ.add(new Car(50, 74));
        pQ.add(new Car(75, 100));

        while(!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}
