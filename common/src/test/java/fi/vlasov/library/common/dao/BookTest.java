package fi.vlasov.library.common.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BookTest {
    private Book dao;

    @Before
    public void setUp() {
        dao = new Book();
    }

    @Test
    public void testTitle() {
        assertNull(dao.getTitle());
        dao.setTitle("Test Title");
        assertEquals("Test Title", dao.getTitle());
    }

    @Test
    public void testLanguage() {
        assertNull(dao.getLanguage());
        dao.setLanguage("en");
        assertEquals("en", dao.getLanguage());
    }

    @Test
    public void testAuthors() {
        assertNull(dao.getAuthors());
        List<Author> authors = createAuthors();
        dao.setAuthors(authors);
        assertEquals(authors, dao.getAuthors());
    }

    private List<Author> createAuthors() {
        return Arrays.asList(
                new Author("Robert C. Martin"),
                new Author("James O. Coplien"));
    }
}
