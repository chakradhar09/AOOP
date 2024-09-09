import GenericPriorityQueue.GenericPriorityQueue;

public class Main {
    public static void main(String[] args) {
        GenericPriorityQueue<Integer> intPriorityQueue = new GenericPriorityQueue<Integer>();
        GenericPriorityQueue<Double> doublePriorityQueue = new GenericPriorityQueue<Double>();
        GenericPriorityQueue<String> stringPriorityQueue = new GenericPriorityQueue<String>();

        intPriorityQueue.enQueue(5, 1);
        intPriorityQueue.enQueue(3, 2);
        intPriorityQueue.enQueue(7, 0);

        while(!intPriorityQueue.isEmpty())
            System.out.println(intPriorityQueue.deQueue());

        doublePriorityQueue.enQueue(5.5, 1);
        doublePriorityQueue.enQueue(3.2, 2);
        doublePriorityQueue.enQueue(7.8, 0);

        while(!doublePriorityQueue.isEmpty())
            System.out.println(doublePriorityQueue.deQueue());

        stringPriorityQueue.enQueue("apple", 1);
        stringPriorityQueue.enQueue("banana", 2);
        stringPriorityQueue.enQueue("cherry", 0);

        while(!stringPriorityQueue.isEmpty())
            System.out.println(stringPriorityQueue.deQueue());
    }
}
