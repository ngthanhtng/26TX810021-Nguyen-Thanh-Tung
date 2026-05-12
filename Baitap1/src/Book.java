public class Book {
    private String title;
    private String author;
    private double price;
    private boolean inStock;

    public Book(String title, String author, double price, boolean inStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public double applyDiscount(double precent){
        price = price * (1 - (precent / 100));
        return price;
    }

    public void printInfo(){
        System.out.println("Ten sach: " + title + ", Tac gia: " + author + ", Gia: " + price + ", Co san: " + inStock);
    }
}
