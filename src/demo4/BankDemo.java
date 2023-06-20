package demo4;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Thread t1 = new Thread(()->{
           for (int i = 0; i<10; i++){
               ba.deposit(100);
               try {
                   Thread.sleep(1000);
               }catch (Exception e){

               }
           }
        });
        Thread t2 = new Thread(()->{
                ba.withdraw(1000);
        });
        t2.start();
        t1.start();
    }
}
