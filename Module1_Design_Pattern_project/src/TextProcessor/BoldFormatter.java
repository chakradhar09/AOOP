package TextProcessor;

public class BoldFormatter implements TextFormatter{
    private final TextFormatter textFormatter;

    public BoldFormatter(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public String format(String text){
        return "**" + textFormatter.format(text) + "**";
    }
}
