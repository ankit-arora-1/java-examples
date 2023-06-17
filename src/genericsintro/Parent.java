package genericsintro;

public class Parent {
    static int fun(int a, int b){
        System.out.println("1");
        return 0;
    }

    static int fun(int... arr) {
        System.out.println("2");
        return 0;
    }
}
