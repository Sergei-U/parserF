import java.util.Objects;

public class PageElement {
    private String tagName;
    private String value;

    public PageElement(String tagName, String value) {
        this.tagName = tagName;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageElement that = (PageElement) o;
        return tagName.equals(that.tagName) &&
                value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, value);
    }

    public String getTagName() {
        return tagName;
    }

    public String getValue() {
        return value;
    }
}
