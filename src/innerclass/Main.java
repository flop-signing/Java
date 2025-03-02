package innerclass;

public class Main {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.show();

        InnerClass.B obj=innerClass.new B(); // calling the process of the innerclass in here.
    }
}
