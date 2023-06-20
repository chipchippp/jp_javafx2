package demo4;

public class BankAccount {
    public int balance = 0;

    public synchronized void deposit(int amount){
        if (amount<=0) return;

        balance += amount;
        System.out.println("Vừa nạp số tiền "+amount);
        notify();
    }

    public synchronized void withdraw(int amount){
        if (amount <=0 ) return;
        while (amount > balance){
            System.out.println("Số tiền cần rút vượt quá số tiền hiện tại ");
            try {
//                Thread.sleep(1000);
                //synchronized có thời gian
                        wait();
                        // giống synchronized
                // wait có thằng nào gọi thì dậy
            }catch (Exception e){

            }
        }
        balance -= amount;
        System.out.println("Vừa rút số tiền "+amount);
    }
}
