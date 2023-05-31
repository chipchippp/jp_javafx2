package db1java2;

public class NoTaxProduct extends Product{
    public NoTaxProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int getImportTax(){
       return 0;
    }

}
