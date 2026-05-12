//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(10, 5);
        Rectangle reg2 = new Rectangle(4, 4);

        System.out.println("Hình chữ nhật 1");
        System.out.println("Diện tích: " + reg1.area() +
                "\nChu vi: " + reg1.perimeter() +
                "\nLà hình vuông: " + reg1.isSquare());
        System.out.println();
        System.out.println("Hình chữ nhật 2");
        System.out.println("Diện tích: " + reg2.area() +
                "\nChu vi: " + reg2.perimeter() +
                "\nLà hình vuông: " + reg2.isSquare());
    }
}