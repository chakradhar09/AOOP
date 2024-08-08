package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookManager {
    private final List<IBook> books = new ArrayList<>();

    public void addBooks(IBook book){
        books.add(book);
   }
   public void removeBooks(String bookISBN){
        if(isBook(bookISBN))
            books.remove(getBook(bookISBN));
        else
            System.out.println("Book not found");
   }
   public boolean isBook(String bookISBN){
        for(IBook i: books){
            if(Objects.equals(bookISBN, i.getBookISBN()))
                return true;
        }
        return false;
   }
   public IBook getBook(String bookISBM){
        for(IBook i: books){
            if(Objects.equals(bookISBM, i.getBookISBN()))
                return i;
        }
        return null;
   }
   public void searchBook(String bookISBN){
        if(isBook(bookISBN))
            System.out.println(getBook(bookISBN));
        else
            System.out.println("Book Not Found");
   }
}
