package TextProcessor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItalicFormatterTest {

    @Test
    void format() {
        TextFormatter textFormatter = new ItalicFormatter(new BaseFormatter());
        String text = "Chakri";
        String expected = "*Chakri*";
        assertEquals(expected, textFormatter.format(text));
    }
}