import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library=new Library(2);
        book =new Book("A book", "Pushkin", "novel");
        borrower=new Borrower();
    }

    @Test
    public void hasCapacity(){
        assertEquals(2,library.getCapacity());
    }


    @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(1,library.bookCount());
    }

    @Test
    public void cantAddBooks(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2,library.getCapacity());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1,library.bookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);

        library.giveBookToBorrower(borrower,book);

        assertEquals(0,library.bookCount());
        assertEquals(1,borrower.getNumberOfBooks());
        assertEquals(true, borrower.hasBook(book));
    }

}
