package kz.epam.training.daemonExample;

public class DaemonThread extends Thread{

    public void run(){
        for(int i=0;i<10; i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
