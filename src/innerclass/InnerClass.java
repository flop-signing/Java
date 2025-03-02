package innerclass;

public class InnerClass {
    int age;
    public void show(){
        System.out.println("Inside show method");
    }
    class B{
        public void config(){
            System.out.println("Inside B config");
        }
    }


}
