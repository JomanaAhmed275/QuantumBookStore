package Books;

public class PaperBook extends Book {
    private int quantity;

    public PaperBook(String title, String isbn, int year, double price, int quantity) {
        super(title, isbn, year, price);
        this.quantity = quantity;
    }

    public int quantity() {
        return quantity;
    }

    public void sale(int amount) {
        this.quantity -= amount;
    }

    @Override
    public boolean is_available() {
        return quantity > 0;
    }
}
