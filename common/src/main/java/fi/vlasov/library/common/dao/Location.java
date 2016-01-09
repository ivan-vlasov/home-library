package fi.vlasov.library.common.dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Location {
    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private long universal_id;

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private long local_id;

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private String name;
}
