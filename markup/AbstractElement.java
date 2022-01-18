package markup;

import java.util.List;

public abstract class AbstractElement implements BBCodeAndMarkdown {
    private List<? extends BBCodeAndMarkdown> texts;

    public AbstractElement(List<? extends BBCodeAndMarkdown> texts) {
        this.texts = texts;
    }

    protected abstract String getBBCodeLeftTag();

    protected abstract String getBBCodeRightTag();

    protected abstract String getMarkdownTag();

    public void toBBCode(StringBuilder builder) {
        builder.append(getBBCodeLeftTag());
        for (BBCode text : texts) {
            text.toBBCode(builder);
        }
        builder.append(getBBCodeRightTag());
    }

    public void toMarkdown(StringBuilder builder) {
        builder.append(getMarkdownTag());
        for (Markdown text : texts) {
            text.toMarkdown(builder);
        }
        builder.append(getMarkdownTag());
    }
}
