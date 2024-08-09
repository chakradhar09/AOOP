package TextProcessor;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseFormatterTest {
    @Test
    public void format() {
        TextFormatter textFormatter = new BaseFormatter();
        String text = "Chakri";
        String expected = "Chakri";
        assertEquals(expected, textFormatter.format(text));
    }
}