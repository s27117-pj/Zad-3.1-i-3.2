public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - " + circle1.toString());

        Circle circle2 = new Circle(3.5);
        System.out.println("Circle 2 - " + circle2.toString());

        Circle circle3 = new Circle(5.0, "blue");
        System.out.println("Circle 3 - " + circle3.toString());

        Circle circle4 = new Circle();
        circle4.setRadius(2.0);
        circle4.setColor("green");
        System.out.println("Circle 4 - " + circle4.toString());
    }
}