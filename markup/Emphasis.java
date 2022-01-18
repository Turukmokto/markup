package markup;

import java.util.List;

public class Emphasis extends AbstractElement implements MyParagraph {
    private static final String BBCodeLeftTag = "[i]";
    private static final String BBCodeRightTag = "[/i]";
    private static final String MarkdownTag = "*";

    public Emphasis(List<MyParagraph> texts) {
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
