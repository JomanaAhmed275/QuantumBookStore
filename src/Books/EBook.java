package Books;

public class EBook extends Book{
    private String filetype;
    public EBook(String title, String isbn, double price,int year,String filetype) {
        super(title, isbn, year, price);
        this.filetype = filetype;
    }
    public String getFiletype() {
        return filetype;
    }
    @Override
    public boolean is_available() {
        return true;
    }

}
