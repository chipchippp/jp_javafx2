package demo3;

public class SubThread extends Thread{
    @Override
    public  void run(){
        for (int i = 0; i< 30; i++){
            System.out.println("Sub i = " +i);
            try {
                Thread.sleep(600); // 1000s
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
