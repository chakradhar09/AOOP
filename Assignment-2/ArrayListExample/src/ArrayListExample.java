import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Empty: " + list.isEmpty());

        list.add("Item1");
        System.out.println("Item1 added");
        list.add("Item2");
        System.out.println("Item2 added");

        System.out.println("First: " + list.getFirst());
        System.out.println("Empty: " + list.isEmpty());

        list.remove("Item1");
        System.out.println("Removed Item1");

        System.out.println("First: " + list.getFirst());
    }
}
