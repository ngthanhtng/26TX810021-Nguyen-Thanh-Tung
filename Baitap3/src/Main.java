//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle[] circles = {
            new Circle(3),
            new Circle(6),
            new Circle(7),
            new Circle(12),
            new Circle(9)
        };

        double total = 0;
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Diện tích hình tròn " + (i + 1) + ": " + circles[i].area());
            total += circles[i].area();
        }

        System.out.println("Tổng diện tích tất cả hình tròn: " + total);
    }
}