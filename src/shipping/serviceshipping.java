package shipping;

import Books.*;
import Mail.mail;

public class serviceshipping {
    public static void buy(Book book, int quantity, String email, String address) {
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.is_available()) {
            System.out.println("Book is not available.");
            return;
        }

        if (book instanceof PaperBook paperBook) {
            if (paperBook.quantity() < quantity) {
                System.out.println("Not enough stock for " + paperBook.title() );
                return;
            }
            paperBook.sale(quantity);
            System.out.println("Shipping to: " + address);
        } else if (book instanceof EBook ebook) {
            System.out.println("Sending eBook to: " + email);
            mail.sendEmail(email, ebook.title(), ebook.getFiletype());
        } else {
            System.out.println("Showcase book. No action needed.");
        }

        System.out.println("Refunded: " + book.price() + " EGP");
    }
}

