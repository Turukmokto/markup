package markup;

public class Text implements MyParagraph {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void toBBCode(StringBuilder builder) {
        builder.append(text);
    }

    @Override
    public void toMarkdown(StringBuilder builder) {
        builder.append(text);
    }
}
