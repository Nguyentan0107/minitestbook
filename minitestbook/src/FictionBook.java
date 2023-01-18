public class FictionBook extends Book{
    private String category;
    public FictionBook(){}
    public FictionBook(String category,String bookCode, String name, double price, String author){
        super(bookCode,name,price,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                '}';
    }
}
