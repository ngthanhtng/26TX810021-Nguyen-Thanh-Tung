
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java hiệu quả", "Joshua Bloch", 550000, true);
        Book book2 = new Book("Người lập trình thực dụng", "Andrew Hunt & David Thomas", 480000, true);
        Book book3 = new Book("Tái cấu trúc mã nguồn", "Martin Fowler", 620000, false);

        System.out.println("Giá sách chưa giảm.");
        book1.printInfo();
        System.out.println();
        book2.printInfo();
        System.out.println();
        book3.printInfo();
        System.out.println();

        book1.applyDiscount(10);
        book2.applyDiscount(10);
        book3.applyDiscount(10);

        System.out.println("Giá sách đã giảm 10%.");
        book1.printInfo();
        System.out.println();
        book2.printInfo();
        System.out.println();
        book3.printInfo();
    }
}