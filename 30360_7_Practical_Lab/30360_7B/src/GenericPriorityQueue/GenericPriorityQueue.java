package GenericPriorityQueue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class GenericPriorityQueue<T> {
    private static class Node<T>{
        private final T element;
        private final int priority;

        public Node(T element, int priority){
            this.element = element;
            this.priority = priority;
        }
    }

    PriorityQueue<Node<T>> priorityQueue;

    public GenericPriorityQueue(){
        this.priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.priority));
    }

    public boolean isEmpty(){
        return !priorityQueue.isEmpty();
    }

    public void enQueue(T element, int priority){
        priorityQueue.offer(new Node<>(element, priority));
    }
    public T deQueue(){
        return Objects.requireNonNull(priorityQueue.poll()).element;
    }
}
