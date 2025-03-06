package threads;

public class RaceCondition {

public static void main(String[] args) throws InterruptedException {


    // At this moment we do run the thread parallely and mutation on same object
    // But we want that we Run one at a time and Mutation will do once at a time.
    // and to do that we use a simple keyword that is  synchronized so if t1 is working with
    // increment then t2 has wait.


    Counter counter=new Counter();
    Runnable obj1=()->{

        for(int i=0;i<1000;i++)
        {
            counter.increment();
        }
    };


    Runnable obj2=()->{
        for(int i=0;i<1000;i++)
        {
            counter.increment();
        }

    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(counter.count);
}
}
