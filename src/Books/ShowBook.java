package Books;

public class ShowBook extends Book {
    public ShowBook(String title, String isbn, int year,double price) {
        super(title, isbn, year, price);
    }
    @Override
    public boolean is_available() {
        return true;
    }


}