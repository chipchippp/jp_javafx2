package practicalexam;

public class Book {
    private String title;
    private Author name;
    private double price;

    public Book(String title, Author name, double price) {
        this.title = title;
        this.name = name;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", name=" + name +  '\'' +
                ", price=" + price;
    }

}
