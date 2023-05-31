package db1java2;

public interface Interface {
    public int insert(Product p);
    public int update(Product p);

    public int delete(String name);
    public int findByName(String name);
    public void select();


}
