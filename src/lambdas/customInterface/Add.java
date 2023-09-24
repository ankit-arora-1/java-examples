package lambdas.customInterface;

public class Add implements MathOperation {

    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
