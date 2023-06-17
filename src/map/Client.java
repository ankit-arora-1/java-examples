package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<Point, String> map = new HashMap<>();
        map.put(new Point(1,2), "1,2");
        map.put(new Point(2,3), "testing");

        System.out.println(map.get(new Point(2,3)));


    }
}
