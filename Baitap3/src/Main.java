//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(3);
        circles[1] = new Circle(6);
        circles[2] = new Circle(7);
        circles[3] = new Circle(12);
        circles[4] = new Circle(9);

        double total = 0;
        for (Circle circle : circles) {
            total += circle .area();
        }

        System.out.println("Area of circles is: " + total);
    }
}