package Product;

public class IllegalArgumentException extends  RuntimeException{
    public IllegalArgumentException() {
    }

    public IllegalArgumentException(String message) {
        super(message);
    }
}