import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenDouble;

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        evenDouble = numbers.stream()
                .filter(number -> number%2 == 0)
                .map(number -> number*2)
                .toList();

        for(int i: evenDouble)
            System.out.println(i);
    }
}
