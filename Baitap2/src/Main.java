//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(10, 5);
        Rectangle reg2 = new Rectangle(4, 4);

        System.out.println("Dien tich hinh 1: " + reg1.area() + ", Chu vi: " + reg1.perimeter() + ", La hinh vuong khong: " + reg1.isSquare());
        System.out.println("Dien tich hinh 2: " + reg2.area() + ", Chu vi: " + reg2.perimeter() + ", La hinh vuong khong: " + reg2.isSquare());
    }
}