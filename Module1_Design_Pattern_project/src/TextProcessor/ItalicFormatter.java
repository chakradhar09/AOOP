package TextProcessor;

public class ItalicFormatter implements TextFormatter{
    private final TextFormatter textFormatter;

    public ItalicFormatter(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public String format(String text){
        return "*" + textFormatter.format(text) + "*";
    }
}
