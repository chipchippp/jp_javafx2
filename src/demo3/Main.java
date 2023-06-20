package demo3;

import sun.awt.windows.ThemeReader;

public class Main {
    public static void main(String[] args) {
        //SubThread
        SubThread st1 = new SubThread();
        st1.start();
        //sub runable
        SubRun sr1 = new SubRun();
        Thread st2 = new Thread();
        st2.start();

        // 1 line
        new SubThread().start();
        new Thread(new SubRun());

        // functional interface --> lambda expertion

        //c1



        //c2
        new Thread(()-> {
            for (int i = 0; i< 20; i++){
                System.out.println("Main i = " +i);
                try {
                    Thread.sleep(600); // 1000s
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }).start();


        for (int i = 0; i< 20; i++){
            System.out.println("Main i = " +i);
            try {
                Thread.sleep(600); // 1000s
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
