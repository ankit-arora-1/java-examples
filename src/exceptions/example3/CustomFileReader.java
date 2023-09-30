package exceptions.example3;

public class CustomFileReader {
    public void readFile(String filePath) throws FileNameIsWrongException {
        System.out.println("Trying kto read the file");
        System.out.println("Doing some operations for reading the file");

        // Rule: Most of the time, throw specific exceptions
        if(!isFileFound(filePath)) {
            throw new FileNameIsWrongException("File name not found");
        }
    }

    public boolean isFileFound(String filePath) {
        // Check if file exists
        return false;
    }
}
