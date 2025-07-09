package Books;

public abstract class Book {
    protected String title;
    protected String isbn;
    protected int    year;
    protected double  price;
    public Book(String title, String isbn, int year, double price) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public String ISbn() {
        return isbn;
    }
    public int  year() {
        return year;
    }
    public double price() {
        return price;
    }
    public String title() {
        return title;
    }

    public abstract boolean is_available() ;

}