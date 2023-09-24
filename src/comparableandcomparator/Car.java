package comparableandcomparator;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private int speed;
    private int engineCapacity;

    public Car(int speed, int engineCapacity) {
        this.speed = speed;
        this.engineCapacity = engineCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car o) {
        // +ve -> this > other
        // -ve -> this < other
        // 0 -> this == other
        if(this.speed > o.getSpeed()) {
            return -1;
        } else if(this.speed < o.getSpeed()) {
            return 1;
        } else {
            return 0;
        }

//        if(this.speed > 100 && o.getSpeed() > 100) {
//            return this.engineCapacity - o.getEngineCapacity();
//        } else {
//            return this.speed - o.getSpeed();
//        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
