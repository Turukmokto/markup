package markup;

import java.util.List;

public class Strong extends AbstractElement implements MyParagraph {
    private static final String BBCodeLeftTag = "[b]";
    private static final String BBCodeRightTag = "[/b]";
    private static final String MarkdownTag = "__";

    public Strong(List<MyParagraph> texts) {
        super(texts);
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
        return MarkdownTag;
    }
}
