package exceptions.example3;

public class Client {
    public static void main(String[] args) {

        try {
            CustomFileReader customFileReader = new CustomFileReader();
            customFileReader.readFile("test.txt");
        } catch (FileNameIsWrongException ex) {
            System.out.println("Some exception occurred");
        }

    }
}
