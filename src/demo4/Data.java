package demo4;

public class Data {
    int x = 0;
    int y = 0;
    int z = 0;

    public synchronized void change(){
        x++;
        y++;
    }
    public synchronized void print(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

    public void changeZ(){
        z++;
    }
    public void printZ(){
        System.out.println("z = "+z);
    }
}
