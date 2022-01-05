import java.sql.Array;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> library;

    public Library(int capacity){
        this.capacity=capacity;
        this.library=new ArrayList<>();
    }
    public int bookCount(){
        return this.library.size();
    }

    public void addBook(Book book) {
        if(bookCount()<capacity){
        this.library.add(book);
    }
    }

    public void removeBook() {
        this.library.remove(0);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
