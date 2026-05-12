
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Lập trình Java cơ bản", "Nguyễn Văn A", 1200, true);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 3500, true);
        Book book3 = new Book("Design Patterns", "Erich Gamma", 4000, false);

        book1.applyDiscount(10);
        book2.applyDiscount(10);
        book3.applyDiscount(10);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}