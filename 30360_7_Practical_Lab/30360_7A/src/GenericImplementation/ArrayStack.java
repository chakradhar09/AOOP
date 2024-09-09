package GenericImplementation;


import java.util.Arrays;

public class ArrayStack<T> implements IStack<T> {
    private T[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int capacity){
        this.arr = (T[]) new Object[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    private void resize(){
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(T element) {
        if(top == capacity-1)
            resize();
        arr[++top] = element;
    }

    @Override
    public T pop() {
        return arr[top--];
    }

    @Override
    public T peek() {
        return arr[top];
    }
}
