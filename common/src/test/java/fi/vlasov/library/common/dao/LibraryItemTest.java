package fi.vlasov.library.common.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class LibraryItemTest {
    private LibraryItem dao;

    @Before
    public void setUp() {
        dao = new LibraryItem();
    }

    @Test
    public void testUName() {
        assertNull(dao.getName());
        dao.setName("Test Name");
        assertEquals("Test Name", dao.getName());
    }

    @Test
    public void testDescription() {
        assertNull(dao.getDescription());
        dao.setDescription("Test Description");
        assertEquals("Test Description", dao.getDescription());
    }

    @Test
    public void testAlternativeNames() {
        assertNull(dao.getAlternativeNames());
        dao.setAlternativeNames(Arrays.asList("Name1", "Name2"));
        assertEquals(Arrays.asList("Name1", "Name2"), dao.getAlternativeNames());
    }
}
