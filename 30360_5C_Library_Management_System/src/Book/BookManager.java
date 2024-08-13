package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookManager {
    private static final List<IBook> books = new ArrayList<>();

    public void addBooks(IBook book){
        if(!books.contains(book)) {
            books.add(book);
            System.out.println("Book Added to Library");
            return;
        }
        System.out.println("Book already exits");
   }
   public void removeBooks(String bookISBN){
        if(isBook(bookISBN)) {
            books.remove(getBook(bookISBN));
            System.out.println("Book is successfully");
            return;
        }
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
        if(isBook(bookISBN)) {
            System.out.println(getBook(bookISBN));
            return;
        }
        System.out.println("Book Not Found");
   }
}
