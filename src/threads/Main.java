package threads;

public class Main {
    public static void main(String[] args) {


        // This is for the threads

//        Hi h = new Hi();
//        Hello hello = new Hello();
//
//
//        h.start();
//        hello.start();
//
//        // we get h.getPriority() and the priority values are in between 1-10.
//        // 1 means low and 10 means high.
//
//        // we setPriority in threads also.
//
//        // we also have MAX_PRIORITY,MIN_PRIORITY AND NORM_PRIORITY Methods.



        // This is for the runnable

        Runnable obj = new Hi();
        Runnable obj1 = new Hello();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
