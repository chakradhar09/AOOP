import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");

        // Remove an element
        set.remove("banana");

        // Print the final data using an iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}