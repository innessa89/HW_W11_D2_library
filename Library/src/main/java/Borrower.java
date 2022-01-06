import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books=new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public boolean hasBook(Book book) {
        return books.contains(book);
    }
}

