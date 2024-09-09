import GenericImplementation.ArrayStack;
import GenericImplementation.LinkedListStack;

public class Main {
    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        ArrayStack<String> arrayStack = new ArrayStack<>(10);

        linkedListStack.push(10);
        linkedListStack.push(20);
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.isEmpty());

        arrayStack.push("Chakri");
        arrayStack.push("Sravan");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.isEmpty());
    }
}
