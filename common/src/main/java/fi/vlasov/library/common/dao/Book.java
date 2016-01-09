package fi.vlasov.library.common.dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Book extends LibraryItem {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private List<Author> authors;

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private String title;

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private int numberOfPages;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String isbn;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String language;
}
