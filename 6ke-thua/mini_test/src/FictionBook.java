public class FictionBook extends Book {
    private String category; // loại
    public FictionBook(String category,String bookCode, double price, String name, String author) {
        super(bookCode, price, name, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public double getPrice() {
        return super.getPrice()*0.93;
    }
    @Override
    public String toString() {
        return "\nTên sách:" +super.getName()
                +"\nLoại:" + getCategory()
                +"\nMã sách:" + super.getBookCode()
                +"\nGiá:" + getPrice() +" VND"
                +"\nTác giả:" +super.getAuthor();
    }
}
