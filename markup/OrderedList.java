package markup;

import java.util.List;

public class OrderedList extends AbstractList {
    private static final String BBCodeLeftTag =  "[list=1]";
    private static final String BBCodeRightTag = "[/list]";
    private static final String MarkdownTag = null;

    public OrderedList(List<ListItem> listItems) {
        super(listItems);
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
