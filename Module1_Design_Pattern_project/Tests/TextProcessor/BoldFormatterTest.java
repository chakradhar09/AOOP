package TextProcessor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoldFormatterTest {

    @Test
    void format() {
        TextFormatter textFormatter = new BoldFormatter(new BaseFormatter());
        String text = "Chakri";
        String expected = "**Chakri**";
        assertEquals(expected, textFormatter.format(text));
    }
}