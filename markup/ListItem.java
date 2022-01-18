package markup;

import java.util.List;

public class ListItem extends AbstractElement implements BBCodeAndMarkdown {
    private static final String BBCodeLeftTag = "[*]";
    private static final String BBCodeRightTag = "";
    private static final String MarkdownTag = null;

    public ListItem(List<MyList> items) {
        super(items);
    }

    @Override
    protected String getBBCodeLeftTag() {
        return BBCodeLeftTag;
    }

    @Override
    protected String getBBCodeRightTag() {
        return BBCodeRightTag;
    }

    @Override
    protected String getMarkdownTag() {
        throw new UnsupportedOperationException();
    }
}
