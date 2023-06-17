package genericsintro;

import java.util.List;

public class Util {
    public <T> void printer(List<T> list) {
        for(Object l: list) {
            System.out.println(l);
        }
    }
}
