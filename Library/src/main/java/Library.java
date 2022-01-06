import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowerCollection;
    private HashMap<String,Integer> genreMap;
    // novel: 1
    // fiction: 4
    public Library(int capacity){
        this.capacity=capacity;
        this.books=new ArrayList<>();
        this.borrowerCollection=new ArrayList<>();
        this.genreMap=new HashMap<>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if(bookCount()<capacity){
            this.books.add(book);
            Integer count = genreMap.get(book.getGenre());
            if(count==null){
                count=0;
            }
            count++;
            genreMap.put(book.getGenre(),count);
        }
    }

    public void removeBook() {
        Book book = this.books.remove(0);
        updateGenreMapOnBookRemoval(book);
    }

    public void giveBookToBorrower(Borrower borrower, Book book){
        books.remove(book);
        borrower.addBook(book);
        updateGenreMapOnBookRemoval(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void updateGenreMapOnBookRemoval(Book book){
        Integer count= genreMap.get(book.getGenre());
        if(count==null){
            count=1;
        }
        count--;
        genreMap.put(book.getGenre(),count);
    }
}
