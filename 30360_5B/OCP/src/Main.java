public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3.0, 2.0);
        Shape circle = new Circle(4.0);

        rectangle.calculateArea();
        circle.calculateArea();
    }
}