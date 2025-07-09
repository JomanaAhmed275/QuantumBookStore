package Books;

public class BookService {
    private Book[] books;
    private int count;

    public BookService(int size) {
        books = new Book[size];
        count = 0;
    }

    public void add_book(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public void remove_books(int maxAge, int currentYear) {
        for (int i = 0; i < count; i++) {
            if (currentYear - books[i].year() > maxAge) {
                books[i] = books[count - 1];
                count--;
                i--;
            }
        }
    }

    public Book findBookbyisbn(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].ISbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }
}

