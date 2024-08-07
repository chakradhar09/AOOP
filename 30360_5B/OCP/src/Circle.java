public class Circle implements Shape{
    private final double radius;
    double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Area of the Circle is: " + (pi * Math.pow(radius, 2)));
    }
}
