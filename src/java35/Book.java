package java35;

public class Book {
    private String book;
    private  double price;
    private int publishing;
    private Athour athour;

    public Book(String book, double price, int publishing, Athour athour) {
        this.book = book;
        this.price = price;
        this.publishing = publishing;
        this.athour = athour;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishing() {
        return publishing;
    }

    public void setPublishing(int publishing) {
        this.publishing = publishing;
    }

    public Athour getAthour() {
        return athour;
    }

    public void setAthour(Athour athour) {
        this.athour = athour;
    }
    public  void inBook(){
        System.out.println(this.book);
    }

    public boolean checkSameYearOfPublication(Book bookk){
//        if (this.publishing == bookk.publishing){
//            return true;
//        } else {
//            return false;
//        }
        return this.publishing == bookk.publishing;
    }
    public double priceAfterLowering(double x){
        return this.price*(1-x/100); //
    }
}
