public class Rectangle implements Shape{
    private final double length;
    private final double breath;

    public Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    public void calculateArea(){
        System.out.println("The area of the Rectangle is: " + (length * breath));
    }
}
