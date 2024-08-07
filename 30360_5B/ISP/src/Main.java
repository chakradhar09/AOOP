public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();

        robot.work();
        human.work();
        human.eats();
    }
}