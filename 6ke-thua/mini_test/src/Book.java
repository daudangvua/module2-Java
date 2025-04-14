public class Book {
    private String bookCode; // mã sản phẩm
    private double price;  // giá
    private String name;
    private String author;  // tác giả

    public Book(String bookCode, double price, String name, String author) {
        this.bookCode = bookCode;
        this.price = price;
        this.name = name;
        this.author = author;
    }
    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: "+getName()
                +"\nBookCode: "+getBookCode()
                +"\nAuthor: "+getAuthor()
                +"\nPrice: "+getPrice();
    }
}

