package fi.vlasov.library.common.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
    private Author dao;

    @Before
    public void setUp() {
        dao = new Author();
    }

    @Test
    public void testLastName() {
        assertEquals("", dao.getLastName());
        dao.setLastName("Test Last Name");
        assertEquals("Test Last Name", dao.getLastName());
    }

    @Test
    public void testFirstNames() {
        assertEquals("", dao.getFirstNames());
        dao.setFirstNames("Test First Names");
        assertEquals("Test First Names", dao.getFirstNames());
    }

    @Test
    public void testShortName() {
        assertEquals("", dao.getShortName());
        dao.setShortName("Test Short Name");
        assertEquals("Test Short Name", dao.getShortName());
    }

    @Test
    public void testFullName() {
        assertEquals("", dao.getFullName());
        dao.setFullName("Test Full Name");
        assertEquals("Test Full Name", dao.getFullName());
    }

    @Test
    public void testInitFromLastName() {
        dao = new Author("Martin");

        assertEquals("Martin", dao.getLastName());
        assertEquals("", dao.getFirstNames());
        assertEquals("Martin", dao.getShortName());
        assertEquals("Martin", dao.getFullName());
    }

    @Test
    public void testInitFromFirstAndLastName() {
        dao = new Author("Robert Martin");

        assertEquals("Martin", dao.getLastName());
        assertEquals("Robert", dao.getFirstNames());
        assertEquals("Martin R.", dao.getShortName());
        assertEquals("Robert Martin", dao.getFullName());
    }

    @Test
    public void testInitFromMultipleNames() {
        dao = new Author("Robert C. Martin");

        assertEquals("Martin", dao.getLastName());
        assertEquals("Robert C.", dao.getFirstNames());
        assertEquals("Martin R. C.", dao.getShortName());
        assertEquals("Robert C. Martin", dao.getFullName());
    }

    @Test
    public void testInitFromNamesWithSpaces() {
        dao = new Author(" Карл  Фридрих \tИероним барон фон Мюнхгаузен \n");

        assertEquals("Мюнхгаузен", dao.getLastName());
        assertEquals("Карл Фридрих Иероним барон фон", dao.getFirstNames());
        assertEquals("Мюнхгаузен К. Ф. И.", dao.getShortName());
        assertEquals("Карл Фридрих Иероним барон фон Мюнхгаузен", dao.getFullName());
    }
}
