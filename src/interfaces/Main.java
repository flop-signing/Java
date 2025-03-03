package interfaces;

public class Main {

    public static void main(String[] args) {

       // FunctionalInterface fh = new FunctionalHelperClass();
        //fh.show();

    /*    // We also do that with anonymous class. and for that time we don't need to create the class that implements interface

        FunctionalInterface fh1 = new FunctionalInterface(){

        };*/
    }

    // Replace this functional interfaces with lambda expressions

/*    FunctionalInterface fh=new FunctionalHelperClass(){
        public void show(){
            System.out.println("Hello World");
        }
    };*/

    // The corresponding Lambda expressions are
/*    FunctionalInterface fhs = ()->{
        System.out.println("Hello World");
    };*/

    // The same thing will do the following way
//    FunctionalInterface fhs = () -> System.out.println("Hello World");

    // if there are one variable then it should be

    //FunctionalInterface fhs = i-> System.out.println("Hello World");

}
