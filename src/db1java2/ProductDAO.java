package db1java2;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements Interface {
    public  static List<Product> ls = new ArrayList<>();
    @Override
    public int insert(Product p) {
        ls.add(p);
        return 0;
    }

    @Override
    public int update(Product p) {
        int pos = findByName(p.getName());
        if (pos<0){
            return -1;
        } else {
            ls.set(pos, p);
        }
        return 1;
    }

    @Override
    public int delete(String name) {
        int pos = findByName(name);
        if (pos<0){
            System.out.println("k tìm thấy ");
            return -1;
        } else {
            ls.remove(pos);

        }
        return 1;
    }

    @Override
    public int findByName(String name) {
        int pos = -1;
        for (int i = 0; i< ls.size(); i++){
            Product p = ls.get(i);
            if (p.getName().equalsIgnoreCase(name)){
                pos = i;
            }
        }
        return pos;
    }

    @Override
    public void select() {
        for (Product p : ls){
            p.output();
        }
    }
}
