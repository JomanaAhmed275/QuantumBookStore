package Books;

import Mail.Mail;
import Exception.OutOfStock;
import Exception.BookNotFound;
import Exception.UnavailableBook;
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
    public void buy(String isbn, int quantity, String email, String address) {
        Book book = findBookbyisbn(isbn);
        if (book == null) {
           throw new BookNotFound(isbn);
        }

        if (!book.is_available()) {
            throw new UnavailableBook(isbn);
        }

        if (book instanceof PaperBook paperBook) {
            if (paperBook.quantity() < quantity) {
               throw new OutOfStock(isbn);
            }
            paperBook.sale(quantity);
            System.out.println("Shipping to: " + address);
        } else if (book instanceof EBook ebook) {
            System.out.println("Sending eBook to: " + email);
            Mail.sendEmail(email, ebook.title(), ebook.getFiletype());
        } else {
            System.out.println("Showcase book. No action needed.");
        }

        System.out.println("Refunded: " + book.price() + " EGP");
    }

}

