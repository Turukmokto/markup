package markup;

import java.util.List;

public class Strikeout extends AbstractElement implements MyParagraph {
    private static final String BBCodeLeftTag = "[s]";
    private static final String BBCodeRightTag = "[/s]";
    private static final String MarkdownTag = "~";

    public Strikeout(List<MyParagraph> texts) {
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
