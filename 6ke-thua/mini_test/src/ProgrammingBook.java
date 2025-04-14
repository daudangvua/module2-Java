public class ProgrammingBook extends Book {
    private String language;
    private String framework;
    public ProgrammingBook(String language, String framework,String bookCode,String name,double price,String author) {
        super(bookCode,price,name,author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
    public double getPrice() {
        return super.getPrice()*0.95;
    }

    @Override
    public String toString() {
        return "\nTên sách: "+super.getName()
                +"\nNgôn ngữ: " +getLanguage()
                +"\nFramework: "+getFramework()
                +"\nGiá: "+getPrice()
                +"\nMã sách: "+super.getBookCode()
                +"\nTác giả: "+super.getAuthor();
    }
}