package java38;


import java35.Date;

public class Computer {
    private Produce produce;
    private Date date;
    private double pice;
    private double warrantyPeriod;

    public Computer(Produce produce, Date date, double pice, double warrantyPeriod) {
        this.produce = produce;
        this.date = date;
        this.pice = pice;
        this.warrantyPeriod = warrantyPeriod;
    }

    public Produce getProduce() {
        return produce;
    }

    public void setProduce(Produce produce) {
        this.produce = produce;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPice() {
        return pice;
    }

    public void setPice(double pice) {
        this.pice = pice;
    }

    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public boolean checkLowerPrice(Computer cpk){ //cpk máy tính khác
        return this.pice < cpk.pice;
    }
    public String nameProduce(){
        return this.produce.getProduce();
    }
}
