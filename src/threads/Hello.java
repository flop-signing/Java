package threads;

/*
public class Hello extends Thread{


    public void run (){

        for(int i=0;i<100;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
*/
public class Hello implements Runnable{


    public void run (){

        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}