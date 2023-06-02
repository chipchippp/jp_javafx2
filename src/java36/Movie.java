package java36;

import java35.Date;

public class Movie {
    private String movie;
    private int yearProduce;
    private Produce produce;
    private double price;
    private Date date;

    public Movie(String movie, int yearProduce, Produce produce, double price, Date date) {
        this.movie = movie;
        this.yearProduce = yearProduce;
        this.produce = produce;
        this.price = price;
        this.date = date;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getYearProduce() {
        return yearProduce;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public Produce getProduce() {
        return produce;
    }

    public void setProduce(Produce produce) {
        this.produce = produce;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean checkCheaperFares(Movie otherMovies){
        return this.price < otherMovies.price;
    }

    public String getTheProducesName(){
        return this.produce.getProduce();
    }

    public double priceAfterLowering(double x){
        return this.price*(1-x/100);
    }
}
