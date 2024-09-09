package GenericImplementation;

import java.util.LinkedList;

public class LinkedListStack<T> implements IStack<T> {
    private final LinkedList<T> stack;

    public LinkedListStack(){
        this.stack = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        stack.addLast(element);
    }

    @Override
    public T pop() {
        return stack.removeLast();
    }

    @Override
    public T peek() {
        return stack.peekLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
