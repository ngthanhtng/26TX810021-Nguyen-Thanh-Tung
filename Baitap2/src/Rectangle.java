public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        double area = (width * height);
        return area;
    }

    public double perimeter() {
        double perimeter = (2 * (width + height));
        return perimeter;
    }

    public boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}
