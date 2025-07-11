package Exception;

public class OutOfStock extends RuntimeException {
    public OutOfStock(String isbn) {
        super("Not enough stock for book "+isbn);
    }
}
