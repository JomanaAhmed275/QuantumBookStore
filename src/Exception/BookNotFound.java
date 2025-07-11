package Exception;

public class BookNotFound extends RuntimeException {
    public BookNotFound(String isbn) {
        super("This book "+isbn+" is not found");
    }

}
