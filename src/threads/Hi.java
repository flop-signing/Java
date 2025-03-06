package threads;

/*public class Hi extends Thread{

    public void run(){

        for(int i=0;i<100;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}*/

public class Hi implements Runnable{

    public void run(){

        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
