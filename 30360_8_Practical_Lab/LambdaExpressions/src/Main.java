import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        arr.add("Chakri");
        arr.add("Navya");
        arr.add("Rishi");
        arr.add("Rohit");

        arr.sort(Comparator.comparing(String::toString).reversed());

        for(String string: arr)
            System.out.println(string);
    }
}
