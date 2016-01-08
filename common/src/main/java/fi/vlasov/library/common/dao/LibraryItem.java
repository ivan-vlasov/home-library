package fi.vlasov.library.common.dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class LibraryItem extends SynchronizedDao {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String name;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String description;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private List<String> alternativeNames;
}
