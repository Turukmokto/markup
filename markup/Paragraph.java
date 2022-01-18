package markup;

import java.util.List;

public class Paragraph extends AbstractElement implements MyList {
    private static final String BBCodeLeftTag = "";
    private static final String BBCodeRightTag = "";
    private static final String MarkdownTag = "";

    public Paragraph(List<MyParagraph> texts) {
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
