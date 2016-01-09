package fi.vlasov.library.common.dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Author extends SynchronizedDao {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String lastName = "";

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String firstNames = "";

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String shortName = "";

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String fullName = "";

    public Author() {
        super();
    }

    public Author(final String fullName) {
        super();

        final String trimmed = StringUtils.trimToEmpty(fullName);
        if (!trimmed.isEmpty()) {
            initFromFullName(trimmed);
        }
    }

    private void initFromFullName(final String fullName) {
        final ArrayList<String> names = new ArrayList<>(Arrays.asList(fullName.split("\\s+")));
        this.fullName = String.join(" ", names);
        this.lastName = names.remove(names.size() - 1);
        if (names.size() > 0) {
            this.firstNames = String.join(" ", names);
            this.shortName = this.lastName + " " + String.join(" ", collectInitials(names));
        } else {
            this.firstNames = "";
            this.shortName = this.lastName;
        }
    }

    private List<String> collectInitials(final List<String> names) {
        return names.stream()
                .filter(name -> !name.isEmpty())
                .map(name -> name.charAt(0))
                .filter(ch -> Character.isUpperCase(ch))
                .map(ch -> ch + ".")
                .collect(Collectors.toList());
    }
}
