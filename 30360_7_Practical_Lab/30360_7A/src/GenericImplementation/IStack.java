package GenericImplementation;

public interface IStack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
}
