package TextProcessor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnderlineFormatterTest {

    @Test
    void format() {
        TextFormatter textFormatter = new UnderlineFormatter(new BaseFormatter());
        String text = "Chakri";
        String expected = "__Chakri__";
        assertEquals(expected, textFormatter.format(text));
    }
}