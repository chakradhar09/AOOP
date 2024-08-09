package Book;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    static BookManager bookManager = new BookManager();

    @Test
    void isBook() {
        assertFalse(bookManager.isBook("kbds"));
    }

    @Test
    void getBook() {
        assertNull(bookManager.getBook("nsvoiudh"));
    }

}