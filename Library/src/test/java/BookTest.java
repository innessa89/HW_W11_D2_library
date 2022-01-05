import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book=new Book("A book", "Pushkin", "novel");
    }

    @Test
    public void hasName(){
        assertEquals("A book", book.getName());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Pushkin", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("novel", book.getGenre());
    }
}
