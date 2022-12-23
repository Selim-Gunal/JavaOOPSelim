public class CircleDriver {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        circle1.setRadius(4);
        circle2.setRadius(6.9);

        System.out.println("Circle1 Specs; " + circle1);
        System.out.println("Circle2 Specs: " + circle2);
    }
}