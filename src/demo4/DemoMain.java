package demo4;

public class DemoMain {
    public static void main(String[] args) {
        Data d = new Data();
        Runnable r = () -> {
                for (int i = 0; i < 20; i++) {
//                synchronized (d){
                    d.change();
                    d.print();
                    d.changeZ();
//                }

                try {
                    Thread.sleep(1000);
                    // t1 cbi in ra 13
                    // thi t2 in ra 14
                } catch (Exception e) {
                    System.out.println();
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
//        t1.start();
//        t2.start();


        Thread tr1 = new Thread(()->{
           for (int i = 0; i<5; i++){
               try {
                   Thread.sleep(1000);
                   System.out.println("DK TK: "+i);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        Thread tr2 = new Thread(()->{
            for (int i = 0; i<5; i++){
                try {
                    Thread.sleep(1000);
                    System.out.println("ATM: "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread tr3 = new Thread(()->{
            for (int i = 0; i<5; i++){
                try {
                    Thread.sleep(1000);
                    System.out.println("Deposit: "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        tr1.start();
        try {
            tr1.join();
        }catch (Exception e){
            tr2.start();
            tr3.start();
        }
    }
}
