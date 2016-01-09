package fi.vlasov.library.common.dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class SynchronizedDao {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private long universalId;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private long localId;
}
