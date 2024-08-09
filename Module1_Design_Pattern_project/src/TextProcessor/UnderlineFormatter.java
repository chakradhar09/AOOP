package TextProcessor;

public class UnderlineFormatter implements TextFormatter{
    private final TextFormatter textFormatter;

    public UnderlineFormatter(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public String format(String text){
        return "__" + textFormatter.format(text) + "__";
    }
}
