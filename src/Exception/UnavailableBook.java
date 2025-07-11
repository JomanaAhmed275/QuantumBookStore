package Exception;

public class UnavailableBook extends RuntimeException {
    public UnavailableBook(String isbn) {
        super("Book "+isbn+" is unavailable");
    }
}
