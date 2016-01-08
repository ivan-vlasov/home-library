package fi.vlasov.library.common.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class SynchronizedDaoTest {
    private SynchronizedDao dao;

    @Before
    public void setUp() {
        dao = new SynchronizedDao();
    }

    @Test
    public void testUniversalId() {
        assertNull(dao.getUniversalId());
        dao.setUniversalId(1L);
        assertEquals(1L, dao.getUniversalId());
    }

    @Test
    public void testLocalId() {
        assertNull(dao.getLocalId());
        dao.setLocalId(1L);
        assertEquals(1L, dao.getLocalId());
    }
}
