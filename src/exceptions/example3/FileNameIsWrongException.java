package exceptions.example3;


public class FileNameIsWrongException extends Exception {
    public FileNameIsWrongException(String text) {
        super(text);
    }
}
